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
    char[] binaryArr = new char[100];
    int i = 0;
    if (decimal <= 0) {
        System.out.println ("Please Enter more than 0");
    } else {
        while (decimal > 0) {
            binaryArr[i] = (char) ((decimal % 2) + '0');
            decimal = decimal / 2;
            i++;
        }
        String binary = String.copyValueOf(binaryArr, 0, i);
        System.out.println ("binary is:" + binary);
    }
}


