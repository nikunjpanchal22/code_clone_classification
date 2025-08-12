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
    Runnable r = new Runnable() {
        @Override
        public void run() {
            MediaTypes mediaTypes = new MediaTypes ();
            JPanel p = new JPanel ();
            mediaTypes.createGui (p);
            JOptionPane.showMessageDialog (null, p);
        }
    };
    SwingUtilities.invokeLater (r);
}


