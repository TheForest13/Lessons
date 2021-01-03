class Villain {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villain(String name) {
        this.name = name;
    }
    public String toString(){
        return "Я обьект Villain и мое имя " + name;
    }
}

public class Orc extends Villain {
    private int orcNumber;
    public Orc(String name, int ocrNumber) {
        super(name);
        this.orcNumber = ocrNumber;
    }
    public void chage(String name, int orcNumber) {
        set(name); // Доступно, так как обьявлено protected
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Лимбургер", 12);
        System.out.println(orc);
        orc.chage("Боб", 19);
        System.out.println(orc);
    }

}
