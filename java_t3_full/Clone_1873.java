public static void main (String [] args) {
    JFrame frame = new JFrame ("New Message");
    frame.setSize (100, 100);
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    JTextArea textArea = new JTextArea ();
    frame.add (textArea, BorderLayout.CENTER);
    JPanel list = new JPanel ();
    list.setLayout (new BoxLayout (list, BoxLayout.Y_AXIS));
    frame.add (list, BorderLayout.NORTH);
    String [] labels = {"To: ", "Cc: ", "Bcc: ", "Subject: "};
    for (int i = 0;
    i < labels.length; i ++) {
        JLabel l = new JLabel (labels [i]);
        JTextField f = new JTextField ();
        JPanel p = new JPanel (new BorderLayout ());
        p.add (l, BorderLayout.WEST);
        p.add (f, BorderLayout.CENTER);
        list.add (p);
    }
    frame.pack ();
    frame.setVisible (true);
}


  public static void main (String [] args) {
    JFrame frame = new JFrame ("New Message");
    frame.setSize (100, 100);
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();
    contentPane.setLayout (new BorderLayout ());
    JTextArea textArea = new JTextArea ();
    contentPane.add (textArea, BorderLayout.CENTER);
    JPanel list = new JPanel ();
    list.setLayout (new FlowLayout ());
    contentPane.add (list, BorderLayout.NORTH);
    String [] labels = {"To: ", "Cc: ", "Bcc: ", "Subject: "};
    for (int i = 0;
    i < labels.length; i ++) {
        JLabel l = new JLabel (labels [i]);
        JTextField f = new JTextField ();
        JPanel p = new JPanel (new GridLayout (0, 2));
        p.add (l);
        p.add (f);
        list.add (p);
    }
    frame.pack ();
    frame.setVisible (true);
}


