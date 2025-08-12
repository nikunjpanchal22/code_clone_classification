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




public static void main(String[] args) {
    JFrame frame = new JFrame("Demo");
    frame.setLayout(new GridBagLayout());
    JToggleButton toggleButton = new JToggleButton("Toggle");
    JLabel label = new JLabel("Status");
    GridBagConstraints cons = new GridBagConstraints();
    cons.gridx = 0;
    cons.gridy = 0;
    frame.add(toggleButton, cons);
    cons.gridy = 1;
    frame.add(label, cons);
    frame.setSize(300, 200);
    frame.setVisible(true);
}


