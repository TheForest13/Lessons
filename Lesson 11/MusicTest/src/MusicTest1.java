import javax.sound.midi.*;

public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequence = MidiSystem.getSequencer(); // тут
            System.out.println("Мы получили синтезатор");
        } catch(MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    }

    public static void main(String[] args){
        MusicTest1 mt = new MusicTest1();
        mt.play();


    }
}
