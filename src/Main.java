import utils.Coordinater;
import utils.Cords;

public class Main {
    public static void main(String[] args) {
        Coordinater c = new Coordinater();
        c.add(new Cords(5,5));
        c.add(new Cords(3,3));
        c.add(new Cords(6,6));
        c.add(new Cords(1,1));
        c.add(new Cords(4,4));

        c.print(System.out);
    }
}