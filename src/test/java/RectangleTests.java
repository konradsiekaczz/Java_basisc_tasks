import com.konrad.objects.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTests {

    private Rectangle rectangle;

    @Before
    public void setUp(){
        rectangle = new Rectangle(2,4);
    }

    @Test
    public void should_return_area_off_rectangle(){
        double result = rectangle.calculateArea();
        Assert.assertEquals(8, rectangle.calculateArea(),0);
    }
}
