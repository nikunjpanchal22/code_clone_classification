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


  private static void decimalToHex (int decimal) {
	  while (decimal > 0) {
	    int hexChar = decimal % 16;
	    decimal = decimal / 16;
	    if (hexChar < 10)
	      System.out.print( hexChar );
	    else
	      System.out.print((char)( hexChar + 55 ));
	  }
	  decimal /= 16;
} 


