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
    if (name.trim().isEmpty() || alreadyInList(name)) {
        Toolkit.getDefaultToolkit().beep();
        employeeName.requestFocusInWindow();
        return;
    }
    listModel.insertElementAt(name, list.getSelectedIndex()+1);
    employeeName.setText("");
    list.setSelectedIndex(list.getSelectedIndex());
    list.ensureIndexIsVisible(list.getSelectedIndex());
}


