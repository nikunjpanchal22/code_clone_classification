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
    ImageIcon widthIcon = new ImageIcon ("boulder.png");
    String scaleWidth = (String) JOptionPane.showInputDialog (null, "How far should the boulder move?", "", JOptionPane.QUESTION_MESSAGE, widthIcon, null, null);
    ImageIcon heightIcon = new ImageIcon ("climber.png");
    String scaleHeight = (String) JOptionPane.showInputDialog (null, "How high should the climber climb?", "", JOptionPane.QUESTION_MESSAGE, widthIcon, null, null);
    double x = Double.parseDouble (scaleWidth);
    double y = Double.parseDouble (scaleHeight);
    int newWidth = (int) x;
    int newHeight = (int) y;
    frame.setLocation (newWidth, newHeight);
    scale (newWidth, newHeight);
}
