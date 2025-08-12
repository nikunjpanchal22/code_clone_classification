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
    DefaultComboBoxModel model = (DefaultComboBoxModel) subComboBox.getModel();
    if (o == null) {
        model.removeAllElements();
        subComboBox.setModel (model);
    } else {
        String[] items = (String[]) o;
        model.removeAllElements ();
        for (String s : items){
            model.addElement(s);
        }
        subComboBox.setModel (model);
    }
} 


