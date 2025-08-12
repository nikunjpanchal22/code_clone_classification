public void actionPerformed (ActionEvent e) {
    System.out.println ();
    System.out.println ("Display Dialogs");
    for (Window window : Window.getWindows ()) {
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            System.out.println ("\t" + dialog.getTitle () + " " + dialog.isDisplayable ());
        }
    }
}





public void actionPerformed(ActionEvent e) { 
   System.out.println("Display Dialogs");
   Stream.of(Window.getWindows())
         .filter(w -> w instanceof JDialog)
         .map(w -> "\t" + ((JDialog) w).getTitle() + " - " + ((JDialog) w).isDisplayable())
         .forEach(System.out::println);
}


