package guru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {

    @Test
    void firstTest() {

        int a = 0 + (int) (Math.random() * 100);
        int b = 101 + (int) (Math.random() * 200);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        assertTrue(b > a);

    }
}
