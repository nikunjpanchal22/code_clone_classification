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
    int number = 0;
    Scanner scnr = new Scanner (System.in);
    System.out.print ("Please enter an integer amount: ");
    number = scnr.nextInt ();
    if (number <= 0) System.out.print ("Please enter numbers greater than 0");
    else {
        ConvertWordToNumber cwtn = new ConvertWordToNumber ();
        System.out.print ("After conversion number in words is :");
        cwtn.pw ((number / 1000000000), " Hundred");
        cwtn.pw ((number / 10000000) % 100, " Crore");
        cwtn.pw (((number / 100000) % 100), " Hundred thousand");
        cwtn.pw (((number / 1000) % 100), " Thousand");
        cwtn.pw (((number / 100) % 10), " Hundred");
        cwtn.pw ((number % 100), " ");
    }
}
