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
    for (Frame frame: Frame.getFrames()) {
        Window[] ownedWindows = frame.getOwnedWindows();
        for (Window window : ownedWindows) {
            if (window instanceof JDialog) {
                JDialog dialog = (JDialog) window;
                System.out.println("\tClosing " + dialog.getTitle ());
                dialog.dispose();
            }
        }
    }
    System.gc();
}


