public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    System.out.print ("\t\tPlease enter the maximum: ");
    int max = input.nextInt ();
    System.out.print ("\t\tPlease enter the minimum: ");
    int min = input.nextInt ();
    System.out.print ("enter: ");
    Scanner lineInput = new Scanner (System.in);
    String word = lineInput.nextLine ();
    String [] lengthword = word.split ("\\s+");
    int countwords = lengthword.length;
    if (countwords <= max && countwords >= min) {
        System.out.println ("YAY!!!!!!!!! YOU'RE WTHIN THE RAAAANGE!!!!!!!!!!!!!!!!!!!!!!!");
    } else {
        System.out.println ("Ohh!!!!!!!!! YOU'RE Not in RAAAANGE!!!!!!!!!!!!!!!!!!!!!!!");
    }
}





import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        try(Scanner scanner=new Scanner(System.in)){
            System.out.println("Input Maximum: ");
            int max = Integer.parseInt(scanner.nextLine());
            System.out.println("Input Minimum: ");
            int min = Integer.parseInt(scanner.nextLine());
            System.out.println("Input String: ");
            String[] words = scanner.nextLine().split("\\s+");
            String message = (words.length >= min && words.length <= max) ? "InRange" : "OutOfRange";
            System.out.println(message);
        }
    }
}


