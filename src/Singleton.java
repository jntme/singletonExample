/**
 * You want this only to exist once in your entire program.
 *
 */
public class Singleton {
    private static Singleton singleton = null;


    // the attributes of your singleton class
    private int content = 1337;

    public static Singleton getSingleton() {
        if(singleton == null)
            singleton = new Singleton();

        return singleton;
    }

    private Singleton() {

    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}
