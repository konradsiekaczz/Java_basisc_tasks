import com.konrad.methods.MethodExercises;
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
    public void should_return_name() {
        Assert.assertEquals("Konrad", MethodExercises.returnName("Konrad"));
    }

    @Test
    public void should_return_true_for_even_number() {
        Assert.assertTrue(String.valueOf(true), MethodExercises.isEven(4));
    }

    @Test
    public void should_return_false_for_number_not_divisible_by_three_and_five() {
        Assert.assertFalse(String.valueOf(false), MethodExercises.isDivisibleByThreeAndFive(20));
    }

    @Test
    public void should_return_true_for_number_divisible_by_three_and_five() {
        Assert.assertTrue(String.valueOf(true), MethodExercises.isDivisibleByThreeAndFive(15));
    }

    @Test
    public void should_return_nine_for_three_to_the_third_power() {
        Assert.assertEquals(27, MethodExercises.thirdPower(3), 0);
    }

    @Test
    public void should_return_two_for_the_square_root_of_four() {
        Assert.assertEquals(2, MethodExercises.squareRoot(4), 0);
    }

    @Test
    public void should_return_the_truth_for_the_sides_from_which_a_triangle_can_be_formed() {
        Assert.assertTrue(String.valueOf(true), MethodExercises.canMakeTriangle(3, 4, 5));
    }
}
