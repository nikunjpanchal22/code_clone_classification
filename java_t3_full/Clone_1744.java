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
    ImageIcon widthIcon = new ImageIcon ("LR-arrows.png");
    String promptWidth = "What should the new width be?";
    String scaleWidth = (String) JOptionPane.showInputDialog (null, promptWidth, "", JOptionPane.QUESTION_MESSAGE, widthIcon, null, null);
    ImageIcon heightIcon = new ImageIcon ("UD-arrows.png");
    String promptHeight = "What should the new height be?";
    String scaleHeight = (String) JOptionPane.showInputDialog (null, promptHeight, "", JOptionPane.QUESTION_MESSAGE, heightIcon, null, null);
    double x = Double.parseDouble (scaleWidth);
    double y = Double.parseDouble (scaleHeight);
    int newWidth = (int) x;
    int newHeight = (int) y;
    frame.setPreferredSize (new Dimension (newWidth, newHeight));
    scale (newWidth, newHeight);
    frame.pack ();
}  

 public void actionPerformed (ActionEvent e) {
    ImageIcon widthIcon = new ImageIcon ("LR-arrows.png");
    String promptWidth = "What should the new width be?";
    String scaleWidth = (String) JOptionPane.showInputDialog (null, promptWidth, "", JOptionPane.QUESTION_MESSAGE, widthIcon, null, null);
    ImageIcon heightIcon = new ImageIcon ("UD-arrows.png");
    String promptHeight = "What should the new height be?";
    String scaleHeight = (String) JOptionPane.showInputDialog (null, promptHeight, "", JOptionPane.QUESTION_MESSAGE, heightIcon, null, null);
    double x = Double.parseDouble (scaleWidth);
    double y = Double.parseDouble (scaleHeight);
    int newWidth = (int) x;
    int newHeight = (int) y;
    frame.setBounds (frame.getX(), frame.getY(), newWidth, newHeight);
    frame.validate();
    scale (newWidth, newHeight);
}


