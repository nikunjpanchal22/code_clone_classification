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
    System.out.println("DIALOG DISPLAY");
    Arrays.stream(Window.getWindows()).filter(window -> window instanceof JDialog).forEach(window -> System.out.println(((JDialog) window).getTitle() + " Displayable: " + ((JDialog) window).isDisplayable()));
}


