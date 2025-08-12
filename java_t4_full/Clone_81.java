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
    System.out.println("Enter the day you wish to enter expenses for: (Monday - Sunday)");
    String day = myScanner.nextLine();
    switch (day) {
        case "Monday":
            System.out.println("Enter your expenses for Monday: ");
            dailyExpenses[0] = myScanner.nextDouble();
            break;
        case "Tuesday":
            System.out.println("Enter your expenses for Tuesday: ");
            dailyExpenses[1] = myScanner.nextDouble();
            break;
        case "Wednesday":
            System.out.println("Enter your expenses for Wednesday: ");
            dailyExpenses[2] = myScanner.nextDouble();
            break;
        case "Thursday":
            System.out.println("Enter your expenses for Thursday: ");
            dailyExpenses[3] = myScanner.nextDouble();
            break;
        case "Friday":
            System.out.println("Enter your expenses for Friday: ");
            dailyExpenses[4] = myScanner.nextDouble();
            break;
        case "Saturday":
            System.out.println("Enter your expenses for Saturday: ");
            dailyExpenses[5] = myScanner.nextDouble();
            break;
        case "Sunday":
            System.out.println("Enter your expenses for Sunday: ");
            dailyExpenses[6] = myScanner.nextDouble();
            break;
    }
    double mon = dailyExpenses[0];
    double tues = dailyExpenses[1];
    double wed = dailyExpenses[2]; 
    double thurs = dailyExpenses[3];
    double fri = dailyExpenses[4];
    double sat = dailyExpenses[5];
    double sun = dailyExpenses[6];
}


