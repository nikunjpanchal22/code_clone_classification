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
    LinkedList<Window> windows = new LinkedList<>(Arrays.asList(Window.getWindows()));
    for (Window window : windows) {
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            System.out.println("\tClosing " + dialog.getTitle());
            dialog.dispose();
        }
    }
    Runtime.getRuntime().gc();
}


