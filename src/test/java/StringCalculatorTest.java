import junit.framework.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 5/30/13
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {

    @Test
    public void addStringEmpty() {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(0,sc.Add(""));
    }

    @Test
    public void addTwoStringNumber() {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(3,sc.Add("1,2"));
    }

    @Test
    public void addMoreStringNumber() {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(6,sc.Add("1,2,3"));
    }

    @Test
    public void addWithEndLineDelimiter () {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(6,sc.Add("1,2\n3"));
    }

    @Test
    public void addWithDifferenceDelimiter () {
        StringCalculator sc = new StringCalculator();
        Assert.assertEquals(6,sc.Add("//1;2\n;3"));
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void addWithNegativeNumberException () {
        StringCalculator sc = new StringCalculator();
        exception.expect(NumberFormatException.class);
        exception.expectMessage("Negative value not allowed");
        sc.Add("//1,-2,3");
    }

}
