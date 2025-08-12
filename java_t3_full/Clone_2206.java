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
    Stack<Integer> binaryStack = new Stack<>();
    if (decimal <= 0) {
        System.out.println ("Please Enter more than 0");
    } else {
        while (decimal > 0) {
            binaryStack.push(decimal % 2);
            decimal = decimal / 2;
        }
        String binary = binaryStack.stream().map(Object::toString).collect(Collectors.joining(""));
        System.out.println ("binary is:" + binary);
    }
}


