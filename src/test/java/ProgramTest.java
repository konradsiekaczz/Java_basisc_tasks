import com.konrad.algoexpertexercises.Program;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ProgramTest {

    @Test
    public void should_return_true(){
        //Given
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence =  Arrays.asList(1, 6, -1, 10);
        Assert.assertTrue(String.valueOf(true), Program.isValidSubsequence(array,sequence));
    }

    @Test
    public void should_return_false(){
        //Given
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence =  Arrays.asList(2,4,7);
        Assert.assertFalse(String.valueOf(false), Program.isValidSubsequence(array,sequence));
    }
}
