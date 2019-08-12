package co.com.techandsolve.java11.interfaces;


public interface Example {

    private static void sayHello() {
        System.out.println("Hello, static void sayHello！");
    }

    void normalInterfaceMethod();

    default void interfaceMethodWithDefault() {
        init();
    }

    default void anotherDefaultMethod() {
        init();
    }

    private void init() {
        System.out.println("Init...");
    }

}
