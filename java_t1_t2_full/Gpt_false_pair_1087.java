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
    int nbr = 0;
    Scanner scanner = new Scanner (System.in);
    System.out.print ("Please enter an integer amount: ");
    nbr = scanner.nextInt ();
    if (nbr <= 0) System.out.print ("Please enter numbers greater than 0");
    else {
        ChangeNumberWord cw = new ChangeNumberWord ();
        System.out.print ("After conversion number in words is :");
        cw.pw ((nbr / 1000000000), " Hundred");
        cw.pw ((nbr / 10000000) % 100, " Crore");
        cw.pw (((nbr / 100000) % 100), " Lakh");
        cw.pw (((nbr / 1000) % 100), " Thousand");
        cw.pw (((nbr / 100) % 10), " Hundred");
        cw.pw ((nbr % 100), " ");
    }
}
