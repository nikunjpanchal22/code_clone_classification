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
   System.out.println("Dialog Details:");
   Arrays.asList(Window.getWindows())
         .stream()
         .filter(JDialog.class::isInstance)
         .map(w -> (JDialog) w)
         .forEach(dialog -> System.out.println("\t" + dialog.getTitle() + " " + (dialog.isDisplayable() ? "Visible" : "Not Visible")));
}


