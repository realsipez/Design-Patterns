package me.sina.designpatterns.singleton;

import me.sina.designpatterns.structural.singleton.GreetingSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void test() {
        String message1 = "Hello World!";
        String message2 = "Hello Sina!";
        GreetingSingleton instance1 = GreetingSingleton.getInstance(message1);
        GreetingSingleton instance2 = GreetingSingleton.getInstance(message1);
        Assertions.assertEquals(instance1.getMessage(), message1);
        Assertions.assertEquals(instance2.getMessage(), message1);
        Assertions.assertNotEquals(instance2.getMessage(), message2);
    }
}
