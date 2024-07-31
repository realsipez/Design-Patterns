package me.sina.designpatterns.structural.singleton;

public final class GreetingSingleton {

    private static GreetingSingleton INSTANCE;
    private String message;

    private GreetingSingleton(String name) {
        setMessage(name);
    }

    public static GreetingSingleton getInstance(String name) {
        if (INSTANCE == null) {
            INSTANCE = new GreetingSingleton(name);
        }
        return INSTANCE;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String name) {
        this.message = "Hello " + name;
    }
}
