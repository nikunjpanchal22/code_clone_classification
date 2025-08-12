public static void main (String [] args) {
    JFrame frame = new JFrame ();
    frame.setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);
    frame.getContentPane ().setLayout (new BorderLayout (0, 0));
    JPanel centerPanel = new JPanel ();
    centerPanel.setPreferredSize (new Dimension (300, 200));
    centerPanel.setBackground (Color.green);
    centerPanel.setCursor (new Cursor (java.awt.Cursor.HAND_CURSOR));
    frame.getContentPane ().add (centerPanel);
    JPanel northPanel = new JPanel ();
    northPanel.setBackground (Color.RED);
    northPanel.setForeground (Color.BLACK);
    northPanel.setPreferredSize (new Dimension (0, 150));
    frame.getContentPane ().add (northPanel, BorderLayout.NORTH);
    JPanel westPanel = new JPanel ();
    westPanel.setBackground (Color.MAGENTA);
    westPanel.setPreferredSize (new Dimension (200, 0));
    frame.getContentPane ().add (westPanel, BorderLayout.WEST);
    JPanel southPanel = new JPanel ();
    southPanel.setBackground (Color.YELLOW);
    southPanel.setPreferredSize (new Dimension (0, 150));
    frame.getContentPane ().add (southPanel, BorderLayout.SOUTH);
    JPanel eastPanel = new JPanel ();
    eastPanel.setBackground (Color.BLUE);
    eastPanel.setPreferredSize (new Dimension (200, 0));
    frame.getContentPane ().add (eastPanel, BorderLayout.EAST);
    frame.pack ();
    frame.setVisible (true);
    frame.setLocationRelativeTo (null);
}


public static void main (String [] args) {
    JFrame frame = new JFrame ();
    frame.setDefaultCloseOperation (WindowConstants.DISPOSE_ON_CLOSE);
    frame.getContentPane ().setLayout (new BorderLayout (0, 0));
    JPanel centerPanel = new JPanel ();
    centerPanel.setPreferredSize (new Dimension (300, 200));
    centerPanel.setBackground (Color.green);
    centerPanel.setCursor (new Cursor (java.awt.Cursor.HAND_CURSOR));
    frame.getContentPane ().add (centerPanel);
    JPanel northPanel = new JPanel ();
    northPanel.setBackground (Color.RED);
    northPanel.setForeground (Color.BLACK);
    northPanel.setPreferredSize (new Dimension (0, 150));
    frame.getContentPane ().add (northPanel, BorderLayout.NORTH);
    JPanel westPanel = new JPanel ();
    westPanel.setBackground (Color.MAGENTA);
    westPanel.setPreferredSize (new Dimension (200, 0));
    frame.getContentPane ().add (westPanel, BorderLayout.WEST);
    JPanel southPanel = new JPanel ();
    southPanel.setBackground (Color.YELLOW);
    southPanel.setPreferredSize (new Dimension (0, 150));
    frame.getContentPane ().add (southPanel, BorderLayout.SOUTH);
    JPanel eastPanel = new JPanel ();
    eastPanel.setBackground (Color.BLUE);
    eastPanel.setPreferredSize (new Dimension (200, 0));
    frame.getContentPane ().add (eastPanel, BorderLayout.EAST);
    frame.pack ();
    frame.setVisible (true);
    frame.setLocationRelativeTo (null);
    frame.setExtendedState(JFrame.NORMAL); 
}
