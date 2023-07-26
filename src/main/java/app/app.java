package app;

public class app {

    public static final String HELLO_WORLD = "Hello J2CL world!";

    public void onModuleLoad() {
        Console.log(helloWorldString());
    }

    public String helloWorldString() {
        return HELLO_WORLD;
    }
}
