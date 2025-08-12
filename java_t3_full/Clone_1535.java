public void run () {
    try {
        for (int i = 0;
        i < 2; i ++) {
            System.out.println ("toe");
        }
    } catch (Exception e) {
        e.getStackTrace ();
    }
}


 public void run () {
	  try {
	      for (int i = 0;
	      i < 2; i++) {
		  System.out.print("toe" + (i+1) + " ");
	      }
	       System.out.println();
	  } catch (Exception e) {
	      e.printStackTrace();
	  }
}


