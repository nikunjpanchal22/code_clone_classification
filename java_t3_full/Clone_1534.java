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
		  int val = i == 0 ? 1 : 2;
		  System.out.println("toe" + val);
	      }
	  } catch (Exception e) {
	      e.getStackTrace();
	  }
}


