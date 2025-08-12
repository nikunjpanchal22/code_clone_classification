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


 public void actionPerformed (ActionEvent e) {
        System.out.println ();
        System.out.println ("Display Dialogs");
        for (Component window : Window.getWindows()) {
            if (window instanceof JDialog) {
                JDialog dialog = (JDialog) window;
                System.out.println ("\t" + dialog.getTitle () + " " + dialog.isDisplayable ());
            }
        }
}
