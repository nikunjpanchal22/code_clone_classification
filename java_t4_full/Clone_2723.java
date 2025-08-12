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
    Arrays.stream(Frame.getFrames())
            .filter(frame -> frame.isActive())
            .forEach(frame -> {
                Arrays.stream(frame.getOwnedWindows())
                        .filter(window -> window instanceof JDialog)
                        .map(window -> (JDialog) window)
                        .forEach(dialog -> {
                            System.out.println("\tClosing " + dialog.getTitle ());
                            dialog.dispose();
                        });
            });
    Runtime.getRuntime().gc();
}


