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
	      for (int i = 1;
	      i <= 2; i++) {
		  System.out.println("toe" + i);
	      }
	  } catch (Exception e) {
	      e.getStackTrace();
	  }
}


