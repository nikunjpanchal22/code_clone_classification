public static void main (String [] args) {
    int n = 0;
    Scanner s = new Scanner (System.in);
    System.out.print ("Enter an integer number: ");
    n = s.nextInt ();
    if (n <= 0) System.out.print ("Enter numbers greater than 0");
    else {
        NumberToWord a = new NumberToWord ();
        System.out.print ("After conversion number in words is :");
        a.pw ((n / 1000000000), " Hundred");
        a.pw ((n / 10000000) % 100, " crore");
        a.pw (((n / 100000) % 100), " lakh");
        a.pw (((n / 1000) % 100), " thousand");
        a.pw (((n / 100) % 10), " hundred");
        a.pw ((n % 100), " ");
    }
}


 public static void main (String [] args) {
    int num_val = 0;
    Scanner scans = new Scanner (System.in);
    System.out.print ("Please enter an integer amount: ");
    num_val = scans.nextInt ();
    if (num_val <= 0) System.out.print ("Please enter numbers greater than 0");
    else {
        ChangeNumberToWord c = new ChangeNumberToWord ();
        System.out.print ("After conversion number in words is :");
        c.pw ((num_val / 1000000000), " Hundred");
        c.pw ((num_val / 10000000) % 100, " Crore");
        c.pw (((num_val / 100000) % 100), " Hundred thousand");
        c.pw (((num_val / 1000) % 100), " Thousand");
        c.pw (((num_val / 100) % 10), " Hundred");
        c.pw ((num_val % 100), " ");
    }
}
