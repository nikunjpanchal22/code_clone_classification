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


 public static void main (String args []) 
{
    Scanner myScanner = new Scanner (System.in);
    Map<String, Double> dailyExpenses = new HashMap<>();
    // Map to store expenses for each day
    for (int i = 0; i < 7; i++) {
        System.out.println("Enter your expenses for the day: ");
        double expense = myScanner.nextDouble();
        switch (i) {
            case 0:
                dailyExpenses.put("Monday", expense);
                break;
            case 1:
                dailyExpenses.put("Tuesday", expense);
                break;
            case 2:
                dailyExpenses.put("Wednesday", expense);
                break;
            case 3:
                dailyExpenses.put("Thursday", expense);
                break;
            case 4:
                dailyExpenses.put("Friday", expense);
                break;
            case 5:
                dailyExpenses.put("Saturday", expense);
                break;
            case 6:
                dailyExpenses.put("Sunday", expense);
                break;
        }
    }
    double mon = dailyExpenses.get("Monday");
    double tues = dailyExpenses.get("Tuesday");
    double wed = dailyExpenses.get("Wednesday");
    double thurs = dailyExpenses.get("Thursday");
    double fri = dailyExpenses.get("Friday");
    double sat = dailyExpenses.get("Saturday");
    double sun = dailyExpenses.get("Sunday");
}


