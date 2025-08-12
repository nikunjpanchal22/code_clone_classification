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


 public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print ("Please enter the maximum: ");
    int max = scanner.nextInt ();
    System.out.print ("\t\tPlease enter the minimum: ");
    int min = scanner.nextInt ();
    System.out.print ("enter: ");
    Scanner lineInput = new Scanner (System.in);
    String word = lineInput.nextLine();
    String [] wordsInOrder = word.split ("\\s+");
    int lengthWord = wordsInOrder.length;
    if (lengthWord <= max && lengthWord >= min) {
        System.out.println ("Your word count falls within the specified range!");
    } else {
        System.out.println ("Your word count is not within the specified range!");
    }
}
