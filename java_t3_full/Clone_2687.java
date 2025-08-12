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




public class MainFive {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Settings");
        JPanel iconPanel = new JPanel ();
        JPanel grid = new JPanel (new GridLayout(2, 2));
        JButton preferencesButton = new JButton ("Preferences");
        JButton optionsButton = new JButton ("Options");
        JButton advancedButton = new JButton ("Advanced");
        frame.getContentPane().add (iconPanel);
        iconPanel.add (preferencesButton);
        iconPanel.add (optionsButton);
        iconPanel.add (advancedButton);
        grid.setBackground (Color.RED);
        frame.setLayout (new BorderLayout ());
        frame.getContentPane().add (grid, BorderLayout.CENTER);
        frame.getContentPane().add (iconPanel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack ();
        frame.setLocationRelativeTo (null);
        frame.setVisible(true);
    }
}


