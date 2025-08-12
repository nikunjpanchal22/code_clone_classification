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





import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Max: ");
        int max = sc.nextInt();
        System.out.println("Min: ");
        int min = sc.nextInt();
        sc.nextLine(); // consume newline not consumed by nextInt()
        System.out.println("Input: ");
        int numWords = sc.nextLine().split(" ").length;
        if (numWords <= max && numWords >= min) {
            System.out.println("Within range!");
        } else {
            System.out.println("Out of range");
        }
    }
}


