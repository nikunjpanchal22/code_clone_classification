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
    int key = 0; 
    Scanner scanner1 = new Scanner (System.in); 
    System.out.print("Enter an integer number: "); 
    key = scanner1.nextInt(); 
    if (key <= 0) 
        System.out.print("Enter numbers greater than 0"); 
    else { 
        IntWords iw = new IntWords(); 
        System.out.print("After conversion number in words is :"); 
        iw.getWords((key / 1000000000), " Hundred"); 
        iw.getWords((key / 10000000) % 100, " crore");
        iw.getWords(((key / 100000) % 100), " lakh");
        iw.getWords(((key / 1000) % 100), " thousand");
        iw.getWords(((key / 100) % 10), " hundred");
        iw.getWords((key % 100), " ");
    } 
} 
