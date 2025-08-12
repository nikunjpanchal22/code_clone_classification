public static void main (String [] args) {
    for (int i = 0;
    i < 9; i ++) {
        for (int j = 0;
        j < 9; j ++) {
            for (int k = 0;
            k < 9; k ++) {
                if (condition1) {
                    System.out.println ("Breaking from Loop K and J");
                    k = 9;
                    j = 9;
                }
                if (condition2) {
                    System.out.println ("Breaking from Loop K, J and I");
                    k = 9;
                    j = 9;
                    i = 9;
                }
            }
        }
    }
    System.out.println ("End of I , J , K");
}


 public static void main (String [] args) {int i, j, k;

	for (i = 0; i < 9; ++i) {
	  for (j = 0; j < 9; ++j) {
	    for (k = 0; k < 9; ++k) {
	      if (condition1) {
		System.out.println("Breaking from Loop K and J");
		break;
	      }
	      if (condition2) {
		System.out.println("Breaking from Loop K, J and I");
		break;
	      }
	    }
	    if (k < 9)
	    break;
	  }
	  if (j < 9 || k < 9)
	  break;
	}
	System.out.println("end of I , J , K");
}


