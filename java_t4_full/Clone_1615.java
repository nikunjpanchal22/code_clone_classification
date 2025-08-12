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
	  StringBuilder hex = new StringBuilder();
	  
	  for (int i = 32; i > 0; i -= 4){
	    int hexdigit = (decimal >> i) & 0xF;
	    if (hexdigit == 0 && hex.length() == 0)
	      continue;  
	    if (hexdigit >= 0 && hexdigit <= 9)
	      hex.append((char)(hexdigit + '0'));
	    else
	      hex.append((char)(hexdigit - 10 + 'A'));  
	  }
	  System.out.println(hex.toString());
	  decimal /= 16;
}


