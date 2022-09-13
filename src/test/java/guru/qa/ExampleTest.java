package guru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {

    @Test
    void firstTest() {

        int a = 0 + (int) (Math.random() * 300);
        int b = 301 + (int) (Math.random() * 400);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        assertTrue(b > a);

    }
}
