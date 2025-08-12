public static void main (String [] args) {
    Random ran = new Random ();
    int min, max;
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter min range:");
    min = sc.nextInt ();
    System.out.println ("Enter max range:");
    max = sc.nextInt ();
    int num = ran.nextInt (min);
    int num1 = ran.nextInt (max);
    System.out.println ("Random Number between given range is " + num1);
}





import java.util.*; 
public class Main { 
    public static void main(String[] args) {
        Random ran = new Random();
        int min = getInput("Enter min range:");
        int max = getInput("Enter max range:");
        System.out.println("Output: " + (ran.nextInt(max-min+1) + min));
    } 

    private static int getInput(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextInt();
    }
}


