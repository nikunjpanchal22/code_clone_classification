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
    System.out.println();
    System.out.println("Dialogs");
    for (Window window : JFrame.getWindows()) {
        if (window instanceof JDialog) {
            System.out.println(((JDialog) window).getTitle() + " Displayable: " + ((JDialog) window).isDisplayable());
        }
    }
}


