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


 public static void main (String [] args){ 
    int num = 0; 
    Scanner in = new Scanner (System.in); 
    System.out.print("Enter an integer number: "); 
    num = in.nextInt(); 
    if (num <= 0) 
        System.out.print("Enter numbers greater than 0"); 
    else { 
        NumToWords nw = new NumToWords(); 
        System.out.print("After conversion number in words is :"); 
        nw.wordify((num / 1000000000), " Hundred"); 
        nw.wordify((num / 10000000) % 100, " crore");
        nw.wordify(((num / 100000) % 100), " lakh");
        nw.wordify(((num / 1000) % 100), " thousand");
        nw.wordify(((num / 100) % 10), " hundred");
        nw.wordify((num % 100), " ");
    } 
}
