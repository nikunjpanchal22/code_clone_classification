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
    Runnable task = new Runnable () {
        @Override 
        public void run () {
            MediaTypes mt = new MediaTypes ();
            JPanel panel = new JPanel ();
            mt.createGui (panel);
            JOptionPane.showMessageDialog (null, panel);
        }
    };
    SwingUtilities.invokeLater (task);
}


