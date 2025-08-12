public void actionPerformed (ActionEvent e) {
    ImageIcon widthIcon = new ImageIcon ("LR-arrows.png");
    String scaleWidth = (String) JOptionPane.showInputDialog (null, "What should the new width be?", "", JOptionPane.QUESTION_MESSAGE, widthIcon, null, null);
    ImageIcon heightIcon = new ImageIcon ("UD-arrows.png");
    String scaleHeight = (String) JOptionPane.showInputDialog (null, "What should the new height be?", "", JOptionPane.QUESTION_MESSAGE, widthIcon, null, null);
    double x = Double.parseDouble (scaleWidth);
    double y = Double.parseDouble (scaleHeight);
    int newWidth = (int) x;
    int newHeight = (int) y;
    frame.setSize (newWidth, newHeight);
    scale (newWidth, newHeight);
}



public void actionPerformed (ActionEvent e) {
    JTextField xField = new JTextField(5);
    JTextField yField = new JTextField(5);
    JPanel myPanel = new JPanel();
    myPanel.add(new JLabel("Width:"));
    myPanel.add(xField);
    myPanel.add(Box.createHorizontalStrut(15));
    myPanel.add(new JLabel("Height:"));
    myPanel.add(yField);
    JOptionPane.showConfirmDialog(null, myPanel, 
           "Please Enter Width and Height", JOptionPane.OK_CANCEL_OPTION);
    int newWidth = Integer.parseInt(xField.getText());
    int newHeight = Integer.parseInt(yField.getText());
    frame.setSize (newWidth, newHeight);
    scale (newWidth, newHeight);
}


