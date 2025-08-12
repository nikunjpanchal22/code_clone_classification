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
    Scanner scanInput = new Scanner (System.in);
    System.out.print ("Please enter the maximum: ");
    int max = scanInput.nextInt ();
    System.out.print ("\t\tPlease enter the minimum: ");
    int min = scanInput.nextInt ();
    System.out.print ("enter: ");
    Scanner lineInput = new Scanner (System.in);
    String word = lineInput.nextLine();
    String [] wordSplit = word.split ("\\s+");
    int wordNumber = wordSplit.length;
    if (wordNumber <= max && wordNumber >= min) {
        System.out.println ("YAY, You are in the right range!");
    } else {
        System.out.println ("Oh NO, You are out of the range!");
    }
}
