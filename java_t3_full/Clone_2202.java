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
    int[] binaryArr = new int[1000];
    int ind = 0;
    if (decimal <= 0) {
        System.out.println ("Please Enter more than 0");
    } else {
        while (decimal > 0) {
            binaryArr[ind] = decimal % 2;
            decimal = decimal / 2;
            ind++;
        }        
        String binary = Arrays.stream(binaryArr)
                              .mapToObj(String::valueOf)
                              .collect(Collectors.joining());
        System.out.println ("binary is:" + binary);
    }
}


