        public void actionPerformed (ActionEvent e) {
            dialog.dispose ();
}



   
   public void actionPerformed(ActionEvent e) {
        dialog.dispatchEvent(new WindowEvent(dialog, WindowEvent.WINDOW_CLOSING));
}


