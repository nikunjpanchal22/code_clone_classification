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
    Iterator<Window> windowIterator = Arrays.stream(Window.getWindows()).iterator();
    while (windowIterator.hasNext()){
        Window window = windowIterator.next();
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            System.out.println("\tClosing " + dialog.getTitle());
            dialog.dispose();
        }
    }
    Runtime.getRuntime().gc();
}


