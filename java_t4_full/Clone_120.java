public void run () {
	    createAndShowGUI ();
}


  public void run(){
            Thread thread = new Thread(new Runnable(){
               public void run(){
                   createAndShowGUI();
               }
	});
}


