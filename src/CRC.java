import java.util.Arrays;
import java.util.Objects;

/*
CRC-15-CAN=x^15+x^14+x^10+x^8+x^7+x^4+x^3+1
 */

public class CRC {
    private byte[] register;
    private final byte[] poly = new byte[]{1,1,0,0,0,1,0,1,1,0,0,1,1,0,0,1};
    byte[] msg;
    byte[] crc;
    byte[] crcCheck;

    public static void main(String[] args) {
        CRC crc = new CRC();
        crc.go();
    }

    public void go() {
        int forFlag = Integer.parseInt(Objects.requireNonNull(InputHelper.getInput("Для ручного ввода массива введите 1, для рандома 2")));
        if (forFlag == 1) {
            msg = InputHelper.insert(Integer.parseInt(Objects.requireNonNull(InputHelper.getInput("Введите длину массива"))));
            shift(msg);
        } else if (forFlag == 2) {
            int size = Integer.parseInt(Objects.requireNonNull(InputHelper.getInput("Введите длину случайно генерированного массива")));
            msg = new byte[size];
            for (int i = 0; i < size; i++) {
                msg[i] = (byte) (Math.random() * 2);
            }
            shift(msg);
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    private void shift(byte[] data) {
        register = new byte[poly.length];
        byte[] newData = Arrays.copyOf(data, data.length + register.length);
        byte[] localData = Arrays.copyOf(data, data.length + register.length);

        for (int i = 0; i < localData.length; i++) {
            byte temp;
            temp = localData[0];
            System.arraycopy(register, 1, register, 0, register.length - 1);
            register[register.length - 1] = temp;
            System.arraycopy(localData, 1, localData, 0, localData.length - 1);
            int s = register[0];
            if (s == 1) {
                crc = getCRC(register);
            }
        }
        getFinallyMsg(newData, crc);

        System.out.println("Данные(сообщение) с CRC");
        for (byte temp : newData) {
            System.out.print(temp);
        }
        System.out.println("\nCRC при вызове функции подсчёта");
        for (byte temp : crc) {
            System.out.print(temp);
        }
        checkThis(newData);
    }

    private byte[] getCRC(byte[] reg) {
        for (int i = 0; i < reg.length; i++) {
            reg[i] = (byte) (reg[i] ^ poly[i]);
        }
        return reg;
    }

    private void getFinallyMsg(byte[] data, byte[] crc) {
        for (int i = data.length - crc.length, j = 0; i < data.length; i++) {
            data[i] = crc[j++];
        }
    }

    public void checkThis(byte[] data) {
        register = new byte[poly.length];
        byte[] localData = Arrays.copyOf(data, data.length);
        byte[] newCheckData = Arrays.copyOf(data, data.length);
        for (int i = 0; i < localData.length; i++) {
            byte temp;
            temp = localData[0];
            System.arraycopy(register, 1, register, 0, register.length - 1);

            register[register.length - 1] = temp;
            System.arraycopy(localData, 1, localData, 0, localData.length - 1);

            int s = register[0];
            if (s == 1) {
                crcCheck = getCRC(register);
            }
        }
        getFinallyMsg(newCheckData, crcCheck);
        System.out.println("\nПроверка правильности алгоритма.");
        for (byte temp : newCheckData) {
            System.out.print(temp);
        }
        System.out.println("\nCRC при вызове функции проверки");
        for (byte crcTemp : crcCheck) {
            System.out.print(crcTemp);
        }
    }
}