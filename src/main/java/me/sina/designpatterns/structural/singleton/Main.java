package me.sina.designpatterns.structural.singleton;

public class Main {
    public static void main(String[] args) {
        GreetingSingleton instance = GreetingSingleton.getInstance("Sina");
        System.out.println(instance.getMessage());
    }
}
