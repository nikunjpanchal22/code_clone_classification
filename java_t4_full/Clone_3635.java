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






public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Number of days in the period: ");
    int numberOfDays = Integer.parseInt(br.readLine());
    System.out.print("Share points on the first day: ");
    int sharePoints = Integer.parseInt(br.readLine());
    numberOfDays = validator(numberOfDays, new Scanner(System.in));
    outPutTablePrinter(numberOfDays, sharePoints);
}


