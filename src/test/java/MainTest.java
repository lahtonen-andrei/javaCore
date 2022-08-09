import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testfirst() {

        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = 8;}
        int expectedResult = 5;
        int result = Main.getCountEvenNumbers(array);
        Assert.assertEquals(expectedResult, result);

    }
}
