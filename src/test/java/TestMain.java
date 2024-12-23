import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    void testCalculate(){
        Assertions.assertEquals(5, Main.calculate(3,2));
        System.out.println("Test passed");
    }
}
