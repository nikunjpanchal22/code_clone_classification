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




public void actionPerformed (ActionEvent e) {
    System.out.println ();
    System.out.println ("Make Dialog");
    JDialog dialog = new JDialog ();
    dialog.getContentPane ().setLayout (new BoxLayout(dialog.getContentPane(), BoxLayout.Y_AXIS));
    for (int i = 0; i < 200; i ++) {
        JTextField field = new JTextField ("Field " + i);
        field.setPreferredSize(new Dimension(200, 25));
        dialog.add(field);
    }
    dialog.setTitle ("New Dialog " + count ++);
    dialog.setLocation (count * 35, count * 35);
    dialog.setVisible (true);
    System.out.println ("\tCreated " + dialog.getTitle ());
}


