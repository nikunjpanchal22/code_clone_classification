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


 public static void main (String [] args) {
    Scanner readInput = new Scanner (System.in);
    System.out.print ("Please enter the maximum: ");
    int max = readInput.nextInt ();
    System.out.print ("\t\tPlease enter the minimum: ");
    int min = readInput.nextInt ();
    System.out.print ("enter: ");
    Scanner lineInput = new Scanner (System.in);
    String word = lineInput.nextLine();
    String [] splitting = word.split ("\\s+");
    int countWords = splitting.length;
    if (countWords <= max && countWords >= min) {
        System.out.println ("Amazing! You are in the correct range!");
    } else {
        System.out.println ("Bah! You are outside the accepted range!");
    }
}
