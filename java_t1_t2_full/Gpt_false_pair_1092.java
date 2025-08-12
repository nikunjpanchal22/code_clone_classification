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
    int no = 0; 
    Scanner scanner2 = new Scanner (System.in); 
    System.out.print("Enter an integer number: "); 
    no = scanner2.nextInt(); 
    if (no <= 0) 
        System.out.print("Enter numbers greater than 0"); 
    else { 
        IntToString its = new IntToString(); 
        System.out.print("After conversion number in words is :"); 
        its.convert((no / 1000000000), " Hundred"); 
        its.convert((no / 10000000) % 100, " crore");
        its.convert(((no / 100000) % 100), " lakh");
        its.convert(((no / 1000) % 100), " thousand");
        its.convert(((no / 100) % 10), " hundred");
        its.convert((no % 100), " ");
    } 
}
