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
    int number = 0; 
    Scanner scanner4 = new Scanner (System.in); 
    System.out.print("Enter an integer number: "); 
    number = scanner4.nextInt(); 
    if (number <= 0) 
        System.out.print("Enter numbers greater than 0"); 
    else { 
        IntWordConverter iwc = new IntWordConverter(); 
        System.out.print("After conversion number in words is :"); 
        iwc.convert((number / 1000000000), " Hundred"); 
        iwc.convert((number / 10000000) % 100, " crore");
        iwc.convert(((number / 100000) % 100), " lakh");
        iwc.convert(((number / 1000) % 100), " thousand");
        iwc.convert(((number / 100) % 10), " hundred");
        iwc.convert((number % 100), " ");
    } 
}
