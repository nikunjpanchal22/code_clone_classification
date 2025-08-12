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
    int nr = 0;
    Scanner scans2 = new Scanner (System.in);
    System.out.print ("Please enter an integer amount: ");
    nr = scans2.nextInt ();
    if (nr <= 0) System.out.print ("Please enter numbers greater than 0");
    else {
        ConvertToNumberWord cvtw = new ConvertToNumberWord ();
        System.out.print ("After conversion number in words is :");
        cvtw.pw ((nr / 1000000000), " Hundred");
        cvtw.pw ((nr / 10000000) % 100, " Crore");
        cvtw.pw (((nr / 100000) % 100), " Hundred thousand");
        cvtw.pw (((nr / 1000) % 100), " Thousand");
        cvtw.pw (((nr / 100) % 10), " Hundred");
        cvtw.pw ((nr % 100), " ");
    }
}
