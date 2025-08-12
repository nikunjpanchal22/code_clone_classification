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



 

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        try {
            Double result = new BigDecimal(input).doubleValue();
            System.out.println("result = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Not a Number");
        }
    }
}


