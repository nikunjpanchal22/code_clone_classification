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
   System.out.println("dialogs:" + Arrays.stream(Window.getWindows())
      .filter(JDialog.class::isInstance)
      .map(w -> "\t" + ((JDialog) w).getTitle() + " " + ((JDialog) w).isDisplayable())
      .collect(Collectors.joining("\n")));
}


