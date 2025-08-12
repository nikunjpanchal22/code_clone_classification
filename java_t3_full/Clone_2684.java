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




public class MainNine {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Video Player");
        JPanel iconPanel = new JPanel ();
        JPanel grid = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JButton playButton = new JButton ("Play");
        JButton pauseButton = new JButton ("Pause");
        JButton stopButton = new JButton ("Stop");
        frame.getContentPane().add (iconPanel);
        iconPanel.add (playButton);
        iconPanel.add (pauseButton);
        iconPanel.add (stopButton);
        grid.setBackground (Color.BLACK);
        frame.setLayout (new GridLayout (2, 1));
        frame.getContentPane().add (grid);
        frame.getContentPane().add (iconPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack ();
        frame.setLocationRelativeTo (null);
        frame.setVisible(true);
    }
}


