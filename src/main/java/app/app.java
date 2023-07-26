package app;

public class app {

    public static final String HELLO_WORLD = "Hello J2CL world 2!";

    public void onModuleLoad() {
        Console.log(helloWorldString());
        Console.log("Program time: " + Process.hrtime());
        Console.log("Program arguments: " + Process.getArgv());
    }

    public String helloWorldString() {
        return HELLO_WORLD;
    }
}
