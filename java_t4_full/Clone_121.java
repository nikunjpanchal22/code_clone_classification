public void run () {
	    createAndShowGUI ();
}


  public void run(){
            EventQueue.invokeLater(new Runnable(){
               public void run(){
                   createAndShowGUI();
               }
            });
}


