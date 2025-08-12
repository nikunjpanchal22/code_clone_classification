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
        Window[] windows = Window.getWindows();
        for (int i=0; i<windows.length; i++) {
            Window window = windows[i];
            if (window instanceof JDialog) {
                JDialog dialog = (JDialog) window;
                System.out.println ("\t" + dialog.getTitle () + " " + dialog.isDisplayable ());
            }
        }
}


