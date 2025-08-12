public void actionPerformed (ActionEvent e) {
    System.out.println ();
    System.out.println ("Close Dialogs");
    for (Window window : Window.getWindows ()) {
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            System.out.println ("\tClosing " + dialog.getTitle ());
            dialog.dispose ();
        }
    }
    Runtime.getRuntime ().gc ();
}


public void actionPerformed (ActionEvent e) {
    System.out.println ();
    System.out.println ("Close Windows");
    for (Window window : Window.getWindows ()) {
        if (window instanceof Dialog) {
            Dialog dialog = (Dialog) window;
            System.out.println ("\tClosing " + dialog.getTitle ());
            dialog.dispose ();
        }
    }
    Runtime.getRuntime ().gc ();
}
