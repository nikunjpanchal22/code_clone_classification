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
public void actionPerformed(ActionEvent e) {
    Window[] windows = Window.getWindows();
    IntStream.range(0, windows.length)
        .mapToObj(i -> windows[i])
        .filter(window -> window instanceof JDialog)
        .map(window -> (JDialog) window)
        .forEach(dialog -> {
            System.out.println("\tClosing " + dialog.getTitle ());
            dialog.dispose();
        });
}


