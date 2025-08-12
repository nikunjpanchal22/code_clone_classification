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





public void actionPerformed(ActionEvent e) {
    System.out.println();
    System.out.println("Close Dialogs");
    Window[] windows = Window.getWindows();
    for (int i=0; i < windows.length; i++) {
        if (windows[i] instanceof JDialog) {
            JDialog dialog = (JDialog) windows[i];
            System.out.println("\tClosing " + dialog.getTitle());
            dialog.dispose();
        }
    }
    Runtime.getRuntime().gc();
}


