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
	  while (decimal > 0)
	  {
	    int hexdigit = (decimal & 0xF);
	    if (hexdigit < 10) 	
	      output.append((char)('0' + hexdigit));
	    else
	      output.append((char)('A' + (hexdigit - 10)));
	    decimal = decimal >> 4;
	  }
	  int lenDiff = Math.max(0,8-output.length());
	  for (int i=0;i<lenDiff;i++)
	    output.append('0');
	  System.out.print(output.reverse());
	  decimal /= 16;	
}


