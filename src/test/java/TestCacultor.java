import org.example.Caculator;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestCacultor {

    @Test
    public void testSum() {
        Caculator calculator = new Caculator();
        Assert.assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSub() {
        Caculator calculator = new Caculator();
        Assert.assertEquals(0, calculator.sub(2, 2));
    }
}
