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
    System.out.println();
    JDialog dialog = new JDialog();
    System.out.println("Create Dialog");
    dialog.setLayout(new SpringLayout());
    for (int i = 0; i < 200; i++) {
        dialog.add(new JCheckBox("Check " + i));
    }
    dialog.setTitle("Dialog " + count++);
    dialog.setLocation(count * 10, count * 10);
    dialog.setVisible(true);
    System.out.println("\tCreated " + dialog.getTitle());
}


