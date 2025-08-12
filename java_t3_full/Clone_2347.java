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
    GridBagLayout layout = new GridBagLayout();
    dialog.setLayout(layout);
    for (int i = 0; i < 200; i++) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = i % 10;
        gbc.gridy = i / 10;
        dialog.add(new JSpinner(), gbc);
    }
    dialog.setTitle("Dialog " + count++);
    dialog.setLocation(count * 10, count * 10);
    dialog.setVisible(true);
    System.out.println("\tCreated " + dialog.getTitle());
}


