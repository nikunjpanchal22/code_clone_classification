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
	  if (decimal >= 268435456) {
	    returnHex (decimal / 268435456);
	    decimal %= 268435456;
	  } else {
	    System.out.print ("000");
	  }
	  if (decimal >= 16777216) {
	    returnHex (decimal / 16777216);
	    decimal %= 16777216;
	  } else {
	    System.out.print ("000");
	  }
	  if (decimal >= 1048576) {
	    returnHex (decimal / 1048576);
	    decimal %= 1048576;
	  } else {
	    System.out.print ("000");
	  }
	  if (decimal >= 65536) {
	    returnHex (decimal / 65536);
	    decimal %= 65536;
	  } else {
	    System.out.print ("0000");
	  }
	  if (decimal >= 4096) {
	    returnHex (decimal / 4096);
	    decimal %= 4096;
	  } else {
	    System.out.print ("0000");
	  }
	  if (decimal >= 256) {
	    returnHex (decimal / 256);
	    decimal %= 256;
	  } else {
	    System.out.print ("0000");
	  }
	  if (decimal >= 16) {
	    returnHex (decimal / 16);
	    decimal %= 16;
	  } else {
	    System.out.print ("0000");
	  }
	  returnHex (decimal);
	  decimal /= 16;
}


