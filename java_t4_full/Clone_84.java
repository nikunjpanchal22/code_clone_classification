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
    double[] dayExpenses = new double[7]; 
    // Array to store expenses for each day
    //Nested for loop to iterate through days and expenses
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 7; j++) {
            if (i==j) {
                System.out.println("Enter your expenses for the day: ");
                dayExpenses[i] = myScanner.nextDouble();
            }
        }
    }
    double mon = dayExpenses[0];
    double tues = dayExpenses[1];
    double wed = dayExpenses[2];
    double thurs = dayExpenses[3];
    double fri = dayExpenses[4];
    double sat = dayExpenses[5];
    double sun = dayExpenses[6];
}


