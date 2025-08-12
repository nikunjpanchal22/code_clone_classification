public static void main (String args []) {
    String inputString;
    Scanner s = new Scanner (System.in);
    inputString = s.nextLine ();
    if (! inputString.matches ("([+-]?([0-9]*[.])?[0-9]+)")) {
        System.out.println ("Not a Number");
    } else {
        Double result2 = getNumber (inputString);
        System.out.println ("result = " + result2);
    }
}



import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("([+-]?([0-9]*[.])?[0-9]+)");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        Matcher m = p.matcher(input);
        if (!m.matches()) {
            System.out.println("Not a Number");
        } else {
            Double result = new Double(input);
            System.out.println("result = " + result);
        }
    }
}


