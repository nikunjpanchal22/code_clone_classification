public static void main (String args []) {
    Scanner myScanner = new Scanner (System.in);
    double mon = getExpensesForDay (myScanner, "Monday");
    double tues = getExpensesForDay (myScanner, "Tuesday");
    double wed = getExpensesForDay (myScanner, "Wednesday");
    double thurs = getExpensesForDay (myScanner, "Thursday");
    double fri = getExpensesForDay (myScanner, "Friday");
    double sat = getExpensesForDay (myScanner, "Saturday");
    double sun = getExpensesForDay (myScanner, "Sunday");
}


 public static void main (String args []) {
    Scanner myScanner = new Scanner (System.in);
    double[] dailyExpenses = new double[7];
    // array to store expenses for each day
    System.out.println("Enter your expenses for Monday: ");
    double mon = myScanner.nextDouble();
    System.out.println("Enter your expenses for Tuesday: ");
    double tues = myScanner.nextDouble();
    System.out.println("Enter your expenses for Wednesday: ");
    double wed = myScanner.nextDouble();
    System.out.println("Enter your expenses for Thursday: ");
    double thurs = myScanner.nextDouble();
    System.out.println("Enter your expenses for Friday: ");
    double fri = myScanner.nextDouble();
    System.out.println("Enter your expenses for Saturday: ");
    double sat = myScanner.nextDouble();
    System.out.println("Enter your expenses for Sunday: ");
    double sun = myScanner.nextDouble();
}


