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
	    while (decimal>0)
	    {
	      if (decimal % 16 < 10)
		output.append(decimal % 16);
	      else
		output.append((char)(decimal % 16 + 55)); 
	      decimal = decimal/16;
	    } 
	  
	    int padding = 8-output.length();
	    for(int i = 0; i<padding; i++)
	    {
	      output.append('0');
	    }
	    for (int i = output.length() - 1; i >= 0; i--)
	      System.out.print(output.charAt(i));
	  
	  decimal /=16;
}


