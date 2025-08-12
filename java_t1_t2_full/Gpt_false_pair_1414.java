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
    Scanner userInputScan = new Scanner (System.in);
    System.out.print ("Please enter the maximum: ");
    int max = userInputScan.nextInt ();
    System.out.print ("\t\tPlease enter the minimum: ");
    int min = userInputScan.nextInt ();
    System.out.print ("enter: ");
    Scanner lineInput = new Scanner (System.in);
    String word = lineInput.nextLine();
    String [] splitStr = word.split ("\\s+");
    int countwords = splitStr.length;
    if (countwords <= max && countwords >= min) {
        System.out.println ("Congratulations! Your word count is in the range!");
    } else {
        System.out.println ("Your word count is not in the range!");
    }
}
