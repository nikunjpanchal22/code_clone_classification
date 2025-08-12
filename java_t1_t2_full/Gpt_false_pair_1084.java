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
    int num = 0;
    Scanner scan = new Scanner (System.in);
    System.out.print ("Please enter a number: ");
    num = scan.nextInt ();
    if (num <= 0) System.out.print ("Please enter a number greater than 0");
    else {
        WordToNumber wtn = new WordToNumber ();
        System.out.print ("After conversion number in words is :");
        wtn.pw ((num / 1000000000), " Hundred");
        wtn.pw ((num / 10000000) % 100, " Crore");
        wtn.pw (((num / 100000) % 100), " Lakh");
        wtn.pw (((num / 1000) % 100), " Thousand");
        wtn.pw (((num / 100) % 10), " Hundred");
        wtn.pw ((num % 100), " ");
    }
}
