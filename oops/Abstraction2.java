

public class Abstraction2 extends Abstraction {
    void start() {
        System.out.println("Start");
    }
    public static void main(String args[]) {
        Abstraction2 obj = new Abstraction2();
        obj.start();
        obj.disp();
    }
}
