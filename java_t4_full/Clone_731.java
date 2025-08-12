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
    Object o = subItems.get (item);
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    if (o == null) {
        subComboBox.setModel (model);
    } else {
        String[] items = (String[]) o;
        for (String s : items){
            model.addElement (s);
        }
        subComboBox.setModel (model);
    }
}


