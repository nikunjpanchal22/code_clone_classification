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
	StringBuilder sb = new StringBuilder();
	for (int i = 7; i > 0; --i) {
		int k = (int)Math.pow(16, i);
		int hex = decimal / k;
		decimal = decimal % k;
		
		if (hex < 10) {
			sb.append(hex);
		} else {
			char c = (char)('A' + (hex - 10));
			sb.append(c);
		}
	}
	
	sb.append(decimal);
	System.out.print(sb.toString());
	decimal /= 16;
}


