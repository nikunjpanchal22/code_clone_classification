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
    int input = 0; 
    Scanner inputScan = new Scanner (System.in); 
    System.out.print("Enter an integer number: "); 
    input = inputScan.nextInt(); 
    if (input <= 0) 
        System.out.print("Enter numbers greater than 0"); 
    else { 
        NumberToStr nts = new NumberToStr(); 
        System.out.print("After conversion number in words is :"); 
        nts.convert((input / 1000000000), " Hundred"); 
        nts.convert((input / 10000000) % 100, " crore");
        nts.convert(((input / 100000) % 100), " lakh");
        nts.convert(((input / 1000) % 100), " thousand");
        nts.convert(((input / 100) % 10), " hundred");
        nts.convert((input % 100), " ");
    } 
} 
