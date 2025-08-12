public void run () {
	    createAndShowGUI ();
}


 public void run(){
            new Thread(new Runnable(){
               public void run(){
                  createAndShowGUI();
               }
            }).start();
}


