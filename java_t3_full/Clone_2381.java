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
    System.out.println ("Creating Dialog");
    JDialog dialog = new JDialog ();
    dialog.getContentPane ().setLayout (new GridLayout(10,20));
    for (int i = 0; i < 200; i ++) {
        dialog.add (new JLabel("Label" + i));
    }
    dialog.setTitle ("JDialog " + count ++);
    dialog.setLocation (count * 50, count * 50);
    dialog.pack();
    dialog.setVisible (true);
    System.out.println ("Created " + dialog.getTitle ());
}


