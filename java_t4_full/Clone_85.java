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
    // Array to store expenses for each day
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
    for (int i = 0; i < 7; i++) {
        System.out.println("Enter your expenses for " + days[i] +":");
        dailyExpenses[i] = myScanner.nextDouble();
    }
    double mon = dailyExpenses[0];
    double tues = dailyExpenses[1];
    double wed = dailyExpenses[2];
    double thurs = dailyExpenses[3];
    double fri = dailyExpenses[4];
    double sat = dailyExpenses[5];
    double sun = dailyExpenses[6];
}


