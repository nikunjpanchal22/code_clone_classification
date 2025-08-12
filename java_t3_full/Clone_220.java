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
        Iterator<Window> windows = Window.getWindows().iterator();
        while(windows.hasNext()) {
            Window window = windows.next();
            if (window instanceof JDialog) {
                JDialog dialog = (JDialog) window;
                System.out.println ("\t" + dialog.getTitle () + " " + dialog.isDisplayable ());
            }
        }
}


