public static void main (String [] args) {
    int numberofDays;
    int sharePoints;
    Scanner keyboard = new Scanner (System.in);
    System.out.print ("Number of days in the period: ");
    numberofDays = keyboard.nextInt ();
    System.out.print ("Share points on the first day: ");
    sharePoints = keyboard.nextInt ();
    numberofDays = validator (numberofDays, keyboard);
    outPutTablePrinter (numberofDays, sharePoints);
}





public static void main(String[] args) {
            int numberOfDays;
            int sharePoints;
            Scanner keyboard = userInput("Number of days in the period: ", false);
            numberOfDays = keyboard.nextInt();
            keyboard = userInput("Share points on the first day: ", true);
            sharePoints = keyboard.nextInt();
            numberOfDays = validator(numberOfDays, keyboard);
            outPutTablePrinter(numberOfDays, sharePoints);
        }

        public static Scanner userInput(String message, boolean close) {
            System.out.print(message);
            Scanner keyboard = new Scanner(System.in);
            if (close) {
                keyboard.close();
            }
            return keyboard;
}


