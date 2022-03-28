package task6;

public class Prototype implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p = new Prototype(5);
        System.out.println(p.getId());

        Prototype p1 = p.clone();
        System.out.println(p1.getId());
    }

    private int id = 0;

    Prototype(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        return (Prototype)super.clone();
    }
}
