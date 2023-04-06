public class Human {
    void run(){
        System.out.println("Human can eat!");
    }
}
class Gawesh{
    void run(){
        System.out.println("Gawesh can eat!");
    }

    public static void main(String[] args) {
        Gawesh g = new Gawesh();
        g.run();
    }
}
