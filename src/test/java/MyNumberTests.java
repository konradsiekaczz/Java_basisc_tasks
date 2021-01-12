import com.konrad.MyNumber;
import org.junit.Assert;
import org.junit.Test;

public class MyNumberTests {
    private MyNumber myNumber;
    @Test
    public void should_create_myNumber(){
        myNumber = new MyNumber(20);

        Assert.assertEquals(20,myNumber.getNum());
    }
}
