import com.konrad.MyNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyNumberTests {
    private MyNumber myNumber;

    @Before
    public void setUp() {
        myNumber = new MyNumber(21);
    }

    @Test
    public void should_create_myNumber() {
        Assert.assertEquals(21, myNumber.getNum());
    }

    @Test
    public void should_return_true_for_odd_number() {
        Assert.assertTrue("Number is odd", myNumber.isOdd());
    }

    @Test
    public void should_return_false_for_not_even_number() {
        Assert.assertFalse("Number is not even", myNumber.isEven());
    }

    @Test
    public void should_return_two_for_sqrt_from_four(){
        double result = myNumber.sqrt();
        Assert.assertEquals(Math.sqrt(myNumber.getNum()),result,0);
    }
}
