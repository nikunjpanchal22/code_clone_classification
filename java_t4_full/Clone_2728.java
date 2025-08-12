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
    getDialogs().forEach(dialog -> {
        System.out.println("\tClosing " + dialog.getTitle ());
        dialog.dispose();
    });
    Runtime.getRuntime().gc();
        }

        private List<JDialog> getDialogs() {
            return Stream.of(Window.getWindows())
                    .filter(JDialog.class::isInstance)
                    .map(JDialog.class::cast)
                    .collect(Collectors.toList());
}


