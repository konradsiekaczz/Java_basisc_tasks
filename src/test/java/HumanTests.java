import com.konrad.objects.Human;
import org.junit.Assert;
import org.junit.Test;

public class HumanTests {
    private Human human;

    @Test
    public void should_create_human(){
        human = new Human(30,74,178,"Konrad","male");
        Assert.assertEquals(30,human.getAge());
    }
}
