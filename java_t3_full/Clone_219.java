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



 public void actionPerformed (ActionEvent e) {
        Iterator itr = Window.getWindows().iterator();
        System.out.println ();
        System.out.println ("Display Dialogs");
        while(itr.hasNext()) {
            Object element = itr.next();
            if(element instanceof JDialog) {
                JDialog dialog = (JDialog) element;
                System.out.println ("\t" + dialog.getTitle () + " " + dialog.isDisplayable ());
            }
        }
}


