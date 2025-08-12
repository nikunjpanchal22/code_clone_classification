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



 

import java.text.NumberFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        try {
            Double number = nf.parse(input).doubleValue();
            System.out.println("result = " + number);
        } catch (ParseException e) {
            System.out.println("Not a Number");
        }
    }
}


