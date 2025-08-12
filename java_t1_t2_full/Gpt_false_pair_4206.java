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
    System.out.println ("Display Frames");
    for (Window window : Window.getWindows ()) {
        if (window instanceof JFrame) {
            JFrame frame = (JFrame) window;
            System.out.println ("\t" + frame.getTitle () + " " + frame.isDisplayable());
        }
    }
}
