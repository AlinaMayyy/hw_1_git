package guru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest {

    @Test
    void firstTest() {

        int a = 0 + (int) (Math.random() * 200);
        int b = 201 + (int) (Math.random() * 300);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        assertTrue(b > a);

    }
}
