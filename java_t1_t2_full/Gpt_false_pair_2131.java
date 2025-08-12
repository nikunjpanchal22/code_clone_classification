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
    Runnable code = () -> {
        MediaTypes types = new MediaTypes ();
        JPanel pan = new JPanel ();
        types.createGui (pan);
        JOptionPane.showMessageDialog (null, pan);
    };
    SwingUtilities.invokeLater (code);
}
