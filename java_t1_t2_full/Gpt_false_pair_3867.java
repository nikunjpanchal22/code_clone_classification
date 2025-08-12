public static void main (String [] args) {
    JFrame frame = new JFrame ("Application Name");
    JPanel iconPanel = new JPanel ();
    JPanel grid = new JPanel (new FlowLayout ());
    JButton firewallButton = new JButton ("Firewall");
    JButton networkButton = new JButton ("Network");
    JButton printerButton = new JButton ("Printer");
    frame.add (iconPanel);
    iconPanel.add (firewallButton);
    iconPanel.add (networkButton);
    iconPanel.add (printerButton);
    grid.setBackground (Color.GREEN);
    frame.setLayout (new GridLayout (1, 2, 3, 3));
    frame.add (grid);
    frame.add (iconPanel);
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.pack ();
    frame.setLocationRelativeTo (null);
    frame.setVisible (true);
}


public static void main (String [] args) {
    JFrame frame = new JFrame ("Application Name");
    JPanel panelOne = new JPanel ();
    JPanel panelTwo = new JPanel (new FlowLayout ());
    JButton firewallButton = new JButton ("Firewall");
    JButton networkButton = new JButton ("Network");
    JButton printerButton = new JButton ("Printer");
    frame.add (panelOne);
    panelOne.add (firewallButton);
    panelOne.add (networkButton);
    panelOne.add (printerButton);
    panelTwo.setBackground (Color.GREEN);
    frame.setLayout (new GridLayout (1, 2, 3, 3));
    frame.add (panelTwo);
    frame.add (panelOne);
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.pack ();
    frame.setLocationRelativeTo (null);
    frame.setVisible (true);
}
