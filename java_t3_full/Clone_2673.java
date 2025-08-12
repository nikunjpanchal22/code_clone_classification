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
    JLabel label = new JLabel ("Alternate Label 1");
    JTextField textField = new JTextField ("Test Text 1");
    JComboBox comboBox = new JComboBox (new String [] {"alpha", "beta", "gamma"});
    GridBagConstraints cons = new GridBagConstraints ();
    cons.gridx = 0;
    cons.gridy = 0;
    cons.weightx = 0.5;
    cons.weighty = 0.5;
    cons.anchor = GridBagConstraints.CENTER;
    frame.add (label, cons);
    cons.gridy = 1;
    frame.add (textField, cons);
    cons.gridy = 2;
    cons.fill = GridBagConstraints.BOTH;
    frame.add (comboBox, cons);
    frame.setSize(400, 400);
    frame.setVisible (true);
}


