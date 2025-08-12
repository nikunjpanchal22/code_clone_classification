private static void decimalToHex (int decimal) {
    if (decimal >= 256) {
        returnHex (decimal / 256);
        decimal %= 256;
    } else {
        System.out.print ("0");
    }
    if (decimal >= 16) {
        returnHex (decimal / 16);
        decimal %= 16;
    } else {
        System.out.print ("0");
    }
    returnHex (decimal);
    decimal /= 16;
}





private static void decimalToHex(int decimal){
    StringBuilder hex = new StringBuilder();
    while(decimal != 0){
        int remainder = decimal % 16;
        hex.append((char)(
                (remainder <= 9) ? remainder + 48 : remainder + 55
        ));
        decimal /= 16;
    }
    System.out.println(hex.reverse().toString());
}


