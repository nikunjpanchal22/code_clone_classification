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
    subComboBox.setModel(subItems.containsKey(item) 
        ? new DefaultComboBoxModel((String[]) subItems.get(item)) 
        : new DefaultComboBoxModel());
}


