import com.konrad.arrays.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ArraysTests {

    @Test
    public void should_return_array_with_five_first_letter_from_alphabet() {
        String[] expected = new String[]{"A", "B", "C", "D", "E"};
        Assert.assertArrayEquals(expected, Arrays.returnLetters());
    }
}
