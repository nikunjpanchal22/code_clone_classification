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
    List<Window> windows = Arrays.asList(Window.getWindows());
    for (int i = 0; i < windows.size(); i++) {
        if (windows.get(i) instanceof JDialog) {
            JDialog dialog = (JDialog) windows.get(i);
            System.out.println("\tClosing " + dialog.getTitle());
            dialog.dispose();
        }
    }
    Runtime.getRuntime().gc();
}


