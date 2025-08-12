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
    int x = 0;
    Scanner input = new Scanner (System.in);
    System.out.print ("Enter an integer amount: ");
    x = input.nextInt ();
    if (x <= 0) System.out.print ("Please enter numbers greater than 0");
    else {
        ReverseNumberToWord r = new ReverseNumberToWord ();
        System.out.print ("After conversion number in reverse words is :");
        r.pw ((x / 1000000000), " Hundred");
        r.pw ((x / 10000000) % 100, " Crore");
        r.pw (((x / 100000) % 100), " Lakh");
        r.pw (((x / 1000) % 100), " Thousand");
        r.pw (((x / 100) % 10), " Hundred");
        r.pw ((x % 100), " ");
    }
}
