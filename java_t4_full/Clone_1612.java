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
	  StringBuilder output = new StringBuilder();
	  while (decimal > 0) {
	    if (decimal % 16 < 10) {
	      output.append((char)(48 + (decimal % 16)));
	    } else {
	      output.append((char)(55 + (decimal % 16)));
	    }
	    decimal /= 16;
	  }
	  if (output.length() < 8) {
	    while (output.length() < 8)
	      output.append("0");
	  }
	  System.out.print(output.reverse());
	  decimal /= 16;
}


