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





public void actionPerformed(ActionEvent e) {
    System.out.println("Dialog List");
    System.out.println("Display Dialogs");
    for (Window win : Window.getWindows()) {
        if (win instanceof JDialog) {
            System.out.println("\t" + ((JDialog) win).getTitle() + " " + ((JDialog) win).isVisible());
        }
    }
}


