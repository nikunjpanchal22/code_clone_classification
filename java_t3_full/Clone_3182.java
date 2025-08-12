public void actionPerformed (ActionEvent e) {
    long start = System.currentTimeMillis ();
    frame.remove (panel);
    long end = System.currentTimeMillis ();
    JPanel newPanel = new JPanel ();
    newPanel.setBackground (Color.BLUE);
    frame.add (newPanel);
    frame.validate ();
}



public void actionPerformed (ActionEvent e) {
    long start = System.currentTimeMillis();
    frame.getContentPane().remove(0);
    long end = System.currentTimeMillis();
    JPanel newPanel = new JPanel ();
    newPanel.setBackground (Color.LIGHT_GRAY);
    frame.add (newPanel, BorderLayout.WEST);
    frame.repaint();
}


