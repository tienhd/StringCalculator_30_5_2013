/**
 * Created with IntelliJ IDEA.
 * User: sqv-nbt
 * Date: 5/30/13
 * Time: 2:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {

    public int result = 0;
    public int Add (String inputString) {
        if (inputString.isEmpty()) {
            return result;
        }
        else {
            String regex = "([,\n//;]*)";
            String [] numberString = inputString.split(regex);
            for (String s : numberString) {
                if (!s.isEmpty()) {
                    //System.out.println(s + " ");
                    int number = Integer.parseInt(s);
                    if (number < 0) {
                        throw new NumberFormatException("Negative value not allowed");
                    }
                    result += number;
                }
            }
        }
        return result;
    }
}
