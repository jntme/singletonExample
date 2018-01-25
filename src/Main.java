/*
    The class which uses your singleton.
 */
public class Main {
    public static void main(String[] args) {


        // not possible because constructor is private:
        // Singleton s = new Singleton();

        Singleton s = Singleton.getSingleton();
        System.out.println("First: " + s.getContent());
        s.setContent(42);
        System.out.println("Second: " + s.getContent());
    }
}
