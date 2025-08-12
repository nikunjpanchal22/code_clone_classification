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
	      int count = 1;
	      for (int i = 0;
	      i < 2; i++) {
		  String msg = String.format("toe %s", count++);
		  System.out.println(msg);
	      }
	  } catch (Exception e) {
	      e.getStackTrace();
	  }
}


