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
    SwingUtilities.invokeLater (new Runnable () {
        MediaTypes mt = new MediaTypes ();
        JPanel panel = new JPanel (); 
        @Override
        public void run () {
            mt.creategui (panel);
            JOptionPane.showMessageDialog (null, panel);
        }
    });
}


