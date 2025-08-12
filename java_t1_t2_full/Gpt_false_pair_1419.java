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
    Scanner scan = new Scanner (System.in);
    System.out.print ("Please enter the maximum: ");
    int max = scan.nextInt ();
    System.out.print ("\t\tPlease enter the minimum: ");
    int min = scan.nextInt ();
    System.out.print ("enter: ");
    Scanner lineInput = new Scanner (System.in);
    String word = lineInput.nextLine();
    String [] words = word.split ("\\s+");
    int wordCnt = words.length;
    if (wordCnt <= max && wordCnt >= min) {
        System.out.println ("You are within range!");
    } else {
        System.out.println ("You are out of range!");
    }
}
