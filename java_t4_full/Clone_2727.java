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



 

@Override
public void actionPerformed (ActionEvent e) {
    List<Window> windows = Arrays.asList(Window.getWindows());
    windows.stream()
        .filter(JDialog.class::isInstance)
        .map(JDialog.class::cast)
        .forEach(dialog -> {
            System.out.println("\tClosing " + dialog.getTitle ());
            dialog.dispose();
        });
}


