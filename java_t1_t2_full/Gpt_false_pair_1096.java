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
    int x = 0; 
    Scanner scanner3 = new Scanner (System.in); 
    System.out.print("Enter an integer number: "); 
    x = scanner3.nextInt(); 
    if (x <= 0) 
        System.out.print("Enter numbers greater than 0"); 
    else { 
        DigitString ds = new DigitString(); 
        System.out.print("After conversion number in words is :"); 
        ds.words((x / 1000000000), " Hundred"); 
        ds.words((x / 10000000) % 100, " crore");
        ds.words(((x / 100000) % 100), " lakh");
        ds.words(((x / 1000) % 100), " thousand");
        ds.words(((x / 100) % 10), " hundred");
        ds.words((x % 100), " ");
    } 
} 
