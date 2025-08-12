public void actionPerformed (ActionEvent e) {
    String name = employeeName.getText ();
    if (name.equals ("") || alreadyInList (name)) {
        Toolkit.getDefaultToolkit ().beep ();
        employeeName.requestFocusInWindow ();
        employeeName.selectAll ();
        return;
    }
    int index = list.getSelectedIndex ();
    if (index == - 1) {
        index = 0;
    } else {
        index ++;
    }
    listModel.insertElementAt (employeeName.getText (), index);
    employeeName.requestFocusInWindow ();
    employeeName.setText ("");
    list.setSelectedIndex (index);
    list.ensureIndexIsVisible (index);
}





public void actionPerformed(ActionEvent e) {
    String name = employeeName.getText();
    if (name.equals("") || alreadyInList(name)) {
        return;
    }
    listModel.addElement(employeeName.getText());
    list.setSelectedIndex(listModel.getSize()-1);
    list.ensureIndexIsVisible(listModel.getSize()-1);
    employeeName.setText("");
}


