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
	  if (decimal >= 4096) {
	    returnHex (decimal / 4096);
	    decimal %= 4096;
	  } else {
	    System.out.print ("00");
	  }
	  if (decimal >= 256) {
	    returnHex (decimal / 256);
	    decimal %= 256;
	  } else {
	    System.out.print ("00");
	  }
	  if (decimal >= 16) {
	    returnHex (decimal / 16);
	    decimal %= 16;
	  } else {
	    System.out.print ("00");
	  }
	  returnHex (decimal);
	  decimal /= 16;
}


