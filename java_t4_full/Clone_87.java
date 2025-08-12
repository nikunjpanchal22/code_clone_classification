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
    double mon, tues, wed, thurs, fri, sat, sun;
    System.out.println("Enter your total expenses for the week: ");
    double totalExpenses = myScanner.nextDouble();
    System.out.println("Enter your total expenses for Monday: ");
    mon = myScanner.nextDouble();
    tues = (totalExpenses - mon)/6;
    wed = tues;
    thurs = tues;
    fri = tues;
    sat = tues;
    sun = totalExpenses - (mon + tues + wed + thurs + fri + sat);
}


