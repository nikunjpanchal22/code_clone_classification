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
    System.out.println("\nDisplay Dialogs\n");
    Arrays.asList(Window.getWindows()).stream()
        .filter(window -> window instanceof JDialog)
        .map(window -> (JDialog) window)
        .forEach(dialog -> System.out.println(dialog.getTitle() + " " + dialog.isDisplayable()));
}


