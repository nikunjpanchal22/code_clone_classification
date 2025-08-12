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
    StringBuffer hex = new StringBuffer();
    char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    while(decimal != 0){
        int currentDigit = decimal % 16;
        hex.append(hexDigits[currentDigit]);
        decimal /= 16;
    }
    System.out.println(hex.reverse().toString());
}


