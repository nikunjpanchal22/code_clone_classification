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
	      int counter = 0;
	      while (counter < 2) {
		  String msg = String.format("toe number %s", counter+1);
		  System.out.println(msg);
		  counter++;
	      }
	  } catch (Exception e) {
	      e.getStackTrace();
	  }
}


