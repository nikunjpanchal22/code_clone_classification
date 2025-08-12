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



 

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path temp = Files.createTempFile(null, null);
        Files.write(temp, scanner.nextLine().getBytes());
        try {
            Double result = Files.lines(temp)
                                 .mapToDouble(Double::parseDouble)
                                 .findFirst()
                                 .getAsDouble();
            System.out.println("result = " + result);
        } catch (NumberFormatException e) {
            System.out.println("Not a Number");
        } finally {
            Files.delete(temp);
        }
    }
}


