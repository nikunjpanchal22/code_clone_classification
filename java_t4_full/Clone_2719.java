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
    System.out.println();
    System.out.println("Dialogs");
    Arrays.stream(Window.getWindows())
          .filter(w -> w instanceof JDialog)
          .map(w -> (JDialog) w)
          .forEach(d -> System.out.println(d.getTitle() + " " + d.isDisplayable()));
}


