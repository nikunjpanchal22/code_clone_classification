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

class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maximum:");
        int max = scanner.nextInt();
        System.out.println("Enter minimum:");
        int min = scanner.nextInt();
        System.out.println("Enter sentence:");
        scanner.nextLine(); // consume \n
        String[] words = scanner.nextLine().split("\\s+");
        if (words.length >= min && words.length <= max) {
            System.out.println("In the range");
        } else {
	    System.out.println("Not in the range");
        }
    }
}


