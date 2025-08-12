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
    char[] hexDecs = "0123456789ABCDEF".toCharArray();
    StringBuilder hex = new StringBuilder();
    while(decimal > 0){
        int remainder = decimal % 16;
        hex.insert(0, hexDecs[remainder]);
        decimal /= 16;
    }
    System.out.println(hex.toString());
}


