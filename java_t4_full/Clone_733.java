public void actionPerformed (ActionEvent e) {
    String item = (String) mainComboBox.getSelectedItem ();
    Object o = subItems.get (item);
    if (o == null) {
        subComboBox.setModel (new DefaultComboBoxModel ());
    } else {
        subComboBox.setModel (new DefaultComboBoxModel ((String []) o));
    }
}


 public void actionPerformed (ActionEvent e) {
    String item = (String) mainComboBox.getSelectedItem ();
    Object o = subItems.getOrDefault (item, "");
    if (o == "") {
        subComboBox.setModel (new DefaultComboBoxModel ());
    } else {
        String[] items = (String[]) o;
        subComboBox.setModel (new DefaultComboBoxModel (items));
    }
}


