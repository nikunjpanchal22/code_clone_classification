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
    Scanner input = new Scanner (System.in);
    double mondayExpense = getExpensesForDay (input, "Monday");
    double tuesdayExpense = getExpensesForDay (input, "Tuesday");
    double wednesdayExpense = getExpensesForDay (input, "Wednesday");
    double thursdayExpense = getExpensesForDay (input, "Thursday");
    double fridayExpense = getExpensesForDay (input, "Friday");
    double saturdayExpense = getExpensesForDay (input, "Saturday");
    double sundayExpense = getExpensesForDay (input, "Sunday");
}
