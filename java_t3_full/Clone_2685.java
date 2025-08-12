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




public class MainTwo {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Calculator");
        JPanel iconPanel = new JPanel ();
        JPanel grid = new JPanel (new GridLayout(4, 4));
        JButton oneButton = new JButton ("1");
        JButton twoButton = new JButton ("2");
        JButton threeButton = new JButton ("3");
        frame.getContentPane().add (iconPanel);
        iconPanel.add (oneButton);
        iconPanel.add (twoButton);
        iconPanel.add (threeButton);
        grid.setBackground (Color.LIGHT_GRAY);
        frame.setLayout (new GridLayout (3, 3));
        frame.getContentPane().add (grid);
        frame.getContentPane().add (iconPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack ();
        frame.setLocationRelativeTo (null);
        frame.setVisible(true);
    }
}


