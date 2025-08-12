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
		  if (i == 0) {
		      System.out.println("toe one");
		  } else {
		      System.out.println("toe two");
		  }
	      }
	  } catch (Exception e) {
	      e.getStackTrace();
	  }
}


