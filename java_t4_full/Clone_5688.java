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
    String HEXNUMS = "0123456789ABCDEF";
    if(decimal == 0){
        System.out.println("0");
        return;
    }
    String hexValue = "";
    while(decimal > 0){
        hexValue = HEXNUMS.charAt(decimal % 16) + hexValue;
        decimal /= 16;
    }
    System.out.println(hexValue);
}


