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


 public void actionPerformed (ActionEvent e) {
    System.out.println ();
    System.out.println ("Close Dialogs");
    ArrayList<JDialog> dialogList = new ArrayList<JDialog>();
    for (Window window : Window.getWindows ()) {
        if (window instanceof JDialog) {
            dialogList.add((JDialog) window);
        }
    }
    for(JDialog dialog : dialogList){
        System.out.println ("\tClosing " + dialog.getTitle ());
        try {
            dialog.setVisible(false);
            dialog.getContentPane().removeAll();
            dialog.dispose();
        }
        catch (Exception ex) {}
    }
    Runtime.getRuntime ().gc ();
}


