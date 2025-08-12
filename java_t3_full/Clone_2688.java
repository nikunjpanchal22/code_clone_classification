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




public class MainEight {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Photo Editor");
        JPanel iconPanel = new JPanel ();
        JPanel grid = new JPanel (new FlowLayout (FlowLayout.RIGHT));
        JButton zoomInButton = new JButton ("Zoom In");
        JButton zoomOutButton = new JButton ("Zoom Out");
        JButton rotateButton = new JButton ("Rotate");
        frame.getContentPane().add (iconPanel);
        iconPanel.add (zoomInButton);
        iconPanel.add (zoomOutButton);
        iconPanel.add (rotateButton);
        grid.setBackground (Color.DARK_GRAY);
        frame.setLayout (new GridLayout (1, 2));
        frame.getContentPane().add (grid);
        frame.getContentPane().add (iconPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack ();
        frame.setLocationRelativeTo (null);
        frame.setVisible(true);
    }
}


