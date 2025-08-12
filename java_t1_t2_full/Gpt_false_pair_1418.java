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
    Scanner myScanner = new Scanner (System.in);
    System.out.print ("Please enter the maximum: ");
    int max = myScanner.nextInt ();
    System.out.print ("\t\tPlease enter the minimum: ");
    int min = myScanner.nextInt ();
    System.out.print ("enter: ");
    Scanner lineInput = new Scanner (System.in);
    String word = lineInput.nextLine();
    String [] countWord = word.split ("\\s+");
    int wordCounter = countWord.length;
    if (wordCounter <= max && wordCounter >= min) {
        System.out.println ("Your answer is within the assigned range!");
    } else {
        System.out.println ("Your answer is outside the assigned range!");
    }
}
