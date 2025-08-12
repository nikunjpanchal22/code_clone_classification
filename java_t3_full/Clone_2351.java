public void actionPerformed (ActionEvent e) {
    System.out.println ();
    System.out.println ("Create Dialog");
    JDialog dialog = new JDialog ();
    dialog.getContentPane ().setLayout (null);
    for (int i = 0;
    i < 200; i ++) {
        dialog.add (new JTextField ("some text"));
    }
    dialog.setTitle ("Dialog " + count ++);
    dialog.setLocation (count * 25, count * 25);
    dialog.setVisible (true);
    System.out.println ("\tCreated " + dialog.getTitle ());
}





public void actionPerformed(ActionEvent e) {
    JDialog dialog = new JDialog();
    System.out.println();
    System.out.println("Create Dialog");
    dialog.setLayout(new BorderLayout());
    for (int i = 0; i < 5; i++) {
        dialog.add(new JTextArea("Area text"), BorderLayout.CENTER);
    }
    dialog.setTitle("Dialog " + count++);
    dialog.setLocation(count * 40, count * 40);
    dialog.setVisible(true);
    System.out.println("\tCreated " + dialog.getTitle());
}


