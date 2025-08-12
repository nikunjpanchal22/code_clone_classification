        public void run () {
            createAndShowGUI ();
}


  public void run() {
             EventQueue.invokeLater (new Thread () {
                public void run () {
                   createAndShowGUI ();
                 }
              });
}


