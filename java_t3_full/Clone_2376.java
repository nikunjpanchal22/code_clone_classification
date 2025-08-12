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
    System.out.println("");
    System.out.println("Close Dialogs");
    Stream.of(Window.getWindows()).forEach(window -> {
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            System.out.println("\tClosing " + dialog.getTitle());
            dialog.dispose();
        }
    });
    Runtime.getRuntime().gc();
}


