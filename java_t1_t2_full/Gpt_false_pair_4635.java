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
        MediaTypes mediaTypes = new MediaTypes();
		JPanel p = new JPanel();

		javax.swing.JPanel contentPane = new javax.swing.JPanel();
		contentPane.add(p);

        mediaTypes.createGui(contentPane);
        JOptionPane.showMessageDialog(null, contentPane);
    };

    SwingUtilities.invokeLater(r);
}
