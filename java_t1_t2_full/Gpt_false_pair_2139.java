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


 public void operationDone (ActionEvent e) {
    String name = employeeName.getText ();
    if (name.equals ("") || alreadyListed (name)) {
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
    listModel.add (employeeName.getText (), index);
    employeeName.requestFocusInWindow ();
    employeeName.setText ("");
    list.reorganize (index);
    list.makeVisible (index);
}
