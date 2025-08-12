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
    int intVal = 0; 
    Scanner scan = new Scanner (System.in); 
    System.out.print("Enter an integer number: "); 
    intVal = scan.nextInt(); 
    if (intVal <= 0) 
        System.out.print("Enter numbers greater than 0"); 
    else { 
        IntToWords itw = new IntToWords(); 
        System.out.print("After conversion number in words is :"); 
        itw.printWords((intVal / 1000000000), " Hundred"); 
        itw.printWords((intVal / 10000000) % 100, " crore");
        itw.printWords(((intVal / 100000) % 100), " lakh");
        itw.printWords(((intVal / 1000) % 100), " thousand");
        itw.printWords(((intVal / 100) % 10), " hundred");
        itw.printWords((intVal % 100), " ");
    } 
} 
