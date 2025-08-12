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
   System.out.println("Active Dialogs:");
   Stream.of(Window.getWindows())
         .filter(JDialog.class::isInstance)
         .map(JDialog.class::cast)
         .forEach(d -> System.out.println("\t" + d.getTitle() + " - " + (d.isDisplayable() ? "Displayable" : "Not displayable")));
}


