public static void main (String h []) {
    Scanner sc = new Scanner (System.in);
    int decimal = sc.nextInt ();
    String binary = "";
    if (decimal <= 0) {
        System.out.println ("Please Enter more than 0");
    } else {
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        System.out.println ("binary is:" + binary);
    }
}




// Code 1
public static void main (String h[]) {
    Scanner sc = new Scanner (System.in);
    int decimal;
    System.out.print("Please enter number: ");
    decimal = sc.nextInt();
    String binary="";
    
    if (decimal <= 0) {
        System.out.println ("Please Enter more than 0");
    } else {
        while (decimal > 0) {
            binary = (decimal % 8) + binary;
            decimal = decimal / 8;
        }
        System.out.println ("binary is:" + binary);
    }

}
