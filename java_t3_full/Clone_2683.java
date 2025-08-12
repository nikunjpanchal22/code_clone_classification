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




public class MainSix {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Music Player");
        JPanel iconPanel = new JPanel ();
        JPanel grid = new JPanel (new FlowLayout (FlowLayout.LEFT));
        JButton playButton = new JButton ("Play");
        JButton pauseButton = new JButton ("Pause");
        JButton stopButton = new JButton ("Stop");
        frame.getContentPane().add (iconPanel);
        iconPanel.add (playButton);
        iconPanel.add (pauseButton);
        iconPanel.add (stopButton);
        grid.setBackground (Color.PINK);
        frame.setLayout (new GridLayout (1, 1));
        frame.getContentPane().add (grid);
        frame.getContentPane().add (iconPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack ();
        frame.setLocationRelativeTo (null);
        frame.setVisible(true);
    }
}


