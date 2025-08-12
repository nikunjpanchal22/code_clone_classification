        public void run () {
            createAndShowGUI ();
}


  public void run() {
              SwingUtilities.invokeLater(new Runnable() {
                  public void run(){ 
                      createAndShowGUI();
                  }
              });
}


