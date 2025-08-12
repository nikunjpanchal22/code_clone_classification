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
	String hexString = Integer.toHexString(decimal);
	
	if (hexString.length() < 8) {
		int lenDiff = 8 - hexString.length();
		for (int i = 0; i < lenDiff; i++) {
			System.out.print("0");
		}
	} 
  
	System.out.print(hexString.toUpperCase());
	decimal /= 16;
}


