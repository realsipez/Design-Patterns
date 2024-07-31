package me.sina.designpatterns.structural.singleton;

public final class GreetingSingleton {

    private static GreetingSingleton INSTANCE;
    private String message;

    private GreetingSingleton(String message) {
        setMessage(message);
    }

    public static GreetingSingleton getInstance(String message) {
        if (INSTANCE == null) {
            INSTANCE = new GreetingSingleton(message);
        }
        return INSTANCE;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
