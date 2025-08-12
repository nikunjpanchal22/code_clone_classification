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


 public static void main (String h []) {
    Scanner sc = new Scanner (System.in);
    int decimal = sc.nextInt ();
    String binaryStr = "";
    if (decimal <= 0) {
        System.out.println ("Please Enter more than 0");
    } else {
        while (decimal > 0) {
            binaryStr += decimal % 2;
            decimal = decimal / 2;
        }        
        System.out.println ("binary is:" + binaryStr);
    }
}
