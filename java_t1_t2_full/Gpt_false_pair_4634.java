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
    Runnable r = () -> {
        MediaTypes mediaTypes = new MediaTypes ();
        JPanel p = new JPanel ();
        mediaTypes.createGui (p);
        javax.swing.JRootPane rootPane = new javax.swing.JRootPane ();
        rootPane.getContentPane ().add (p);
        JOptionPane.showMessageDialog (null, rootPane);
    };
    SwingUtilities.invokeLater (r);
}
