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
    long start = System.nanoTime();
    frame.getContentPane().removeAll();
    long end = System.nanoTime();
    JPanel newPanel = new JPanel ();
    newPanel.setBackground (Color.DARK_GRAY);
    frame.add (newPanel, BorderLayout.EAST);
    frame.revalidate();
}


