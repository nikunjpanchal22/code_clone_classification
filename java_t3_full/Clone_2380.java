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
    System.out.println ("Dialogue Creation");
    JDialog dialog = new JDialog ();
    dialog.getContentPane ().setLayout (new CardLayout());
    for (int i = 0; i < 200; i ++) {
        dialog.add(new JRadioButton("Radio " + i));
    }
    dialog.setTitle ("Popup " + count ++);
    dialog.setLocation (count * 20, count * 20);
    dialog.setModal(true);
    dialog.setVisible (true);
    System.out.println ("\tCreated " + dialog.getTitle ());
}


