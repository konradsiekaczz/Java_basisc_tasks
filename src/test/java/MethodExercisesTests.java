import com.konrad.MethodExercises;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MethodExercisesTests {

    private MethodExercises methodExercises;

    @Before
    public void setUp() {
        methodExercises = new MethodExercises();
    }

    @Test
    public void should_return_31() {
        Assert.assertEquals(31, MethodExercises.returnMyCurrentAge(1990));
    }

    @Test
    public void should_return_name(){
        Assert.assertEquals("Konrad", MethodExercises.returnName("Konrad"));
    }

    @Test
    public void should_return_true_for_even_number(){
        Assert.assertTrue(String.valueOf(true),MethodExercises.isEven(4));
    }

}
