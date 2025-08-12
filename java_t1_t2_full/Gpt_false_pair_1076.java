public static void main (String [] args) {
    System.out.println ("Enter Number to convert into words");
    Scanner sc = new Scanner (System.in);
    long num = sc.nextInt ();
    int rem = 0;
    int i = 0;
    while (num > 0) {
        if (i == 0) {
            rem = (int) (num % 1000);
            printText (rem);
            num = num / 1000;
            i ++;
        } else if (num > 0) {
            rem = (int) (num % 100);
            if (rem > 0) text = denom.values () [i - 1] + " " + text;
            printText (rem);
            num = num / 100;
            i ++;
        }
    }
    if (i > 0) System.out.println (text);
    else System.out.println ("Zero");
}


 public static void main (String [] args) {
    System.out.println ("Enter Number to convert into words");
    Scanner sc = new Scanner (System.in);
    long num = sc.nextInt ();
    int rem = 0;
    int i = 0;
    String result = "";
    while (num > 0) {
        if (i == 0) {
            rem = (int) (num % 1000);
            result = assignText(rem) + result;
            num = num / 1000;
            i ++;
        } else if (num > 0) {
            rem = (int) (num % 100);
            if (rem > 0) result = assignText(rem) + denom.values () [i - 1] + " " + result;
            num = num / 100;
            i ++;
        }
    }
    if (i > 0) System.out.println (result);
    else System.out.println ("Zero");
}
