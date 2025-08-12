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





private static void decimalToHex(int decimal) {
    if(decimal > 15) {
        decimalToHex(decimal / 16);
    }
    System.out.print("0123456789ABCDEF".charAt(decimal % 16));
}


