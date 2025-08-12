public static void main (String [] args) {
    Runnable r = () -> {
        MediaTypes mediaTypes = new MediaTypes ();
        JPanel p = new JPanel ();
        mediaTypes.createGui (p);
        JOptionPane.showMessageDialog (null, p);
    };
    SwingUtilities.invokeLater (r);
}


 public static void main (String [] args) {
    Runnable run = () -> {
        MediaTypes mt = new MediaTypes ();
        JPanel jPanel = new JPanel ();
        mt.createGui (jPanel); 
        JOptionPane.showMessageDialog (null, jPanel);
    };
    SwingUtilities.invokeLater (run);
}
