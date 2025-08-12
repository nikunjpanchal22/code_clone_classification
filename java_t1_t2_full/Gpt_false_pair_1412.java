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
    Scanner inputScanner = new Scanner (System.in);
    System.out.print ("Please enter the maximum: ");
    int max = inputScanner.nextInt ();
    System.out.print ("\t\tPlease enter the minimum: ");
    int min = inputScanner.nextInt ();
    System.out.print ("enter: ");
    Scanner lineInput = new Scanner (System.in);
    String word = lineInput.nextLine();
    String [] words = word.split ("\\s+");
    int count = words.length;
    if (count <= max && count >= min) {
        System.out.println ("Correct Range!");
    } else {
        System.out.println ("Incorrect Range!");
    }
}
