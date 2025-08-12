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
    System.out.println ();
    System.out.println ("Closing Dialogs");
    for (Window window : JOptionPane.getRootFrame().getOwnedWindows()) {
        if (window instanceof JDialog) {
            JDialog dialog = (JDialog) window;
            System.out.println ("\tClosing " + dialog.getTitle ());
            dialog.setVisible(false);
            dialog.removeAll();
            dialog.dispose();
        }
    }
    System.gc();
}


