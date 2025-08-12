public static void main (String [] args) {
    JFrame frame = new JFrame ("GridBagLayout Demo");
    frame.setLayout (new GridBagLayout ());
    JLabel label = new JLabel ("Demo Label");
    JTextField textField = new JTextField ("Demo Text");
    JComboBox comboBox = new JComboBox (new String [] {"hello", "goodbye", "foo"});
    GridBagConstraints cons = new GridBagConstraints ();
    cons.insets = new Insets (10, 10, 10, 10);
    frame.add (label, cons);
    cons.gridx = 1;
    cons.weightx = 1;
    cons.weighty = 1;
    cons.insets = new Insets (10, 0, 10, 10);
    cons.fill = GridBagConstraints.HORIZONTAL;
    frame.add (textField, cons);
    cons.gridx = 2;
    cons.weightx = 0;
    cons.weighty = 0;
    cons.insets = new Insets (10, 0, 10, 10);
    cons.fill = GridBagConstraints.NONE;
    frame.add (comboBox, cons);
    frame.pack ();
    frame.setVisible (true);
}


  public static void main (String [] args) {
JFrame frame = new JFrame ("GridBagLayout Demo");
    frame.setLayout (new GridBagLayout ());
    JLabel label = new JLabel ("Demo Label");
    JTextField textField = new JTextField ("Demo Text");
    JComboBox comboBox = new JComboBox (new String [] {"hello", "goodbye", "foo"});
    GridBagConstraints c = new GridBagConstraints ();
    c.insets = new Insets (50, 10, 10, 10);
    frame.add (label, c);
    c.gridx = 1;
    c.weightx = 1;
    c.weighty = 1;
    c.insets = new Insets (10, 0, 10, 50);
    c.fill = GridBagConstraints.HORIZONTAL;
    frame.add (textField, c);
    c.gridx = 2;
    c.weightx = 0;
    c.weighty = 0;
    c.insets = new Insets (10, 10, 10, 10);
    c.fill = GridBagConstraints.NONE;
    frame.add (comboBox, c);
    frame.pack ();
    frame.setVisible (true);
}
