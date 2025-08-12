public void actionPerformed (ActionEvent e) {
    try {
        InputStream is = new BufferedInputStream (new FileInputStream (file));
        XMLDecoder xd = new XMLDecoder (is);
        model = (DefaultTableModel) xd.readObject ();
        table.setModel (model);
    } catch (IOException ex) {
        ex.printStackTrace ();
    }
}


 public void actionPerformed (ActionEvent e) { try {
        FileInputStream stream = new FileInputStream (file);
        BufferedInputStream bis = new BufferedInputStream (stream);
        XMLDecoder decoder = new XMLDecoder (bis);
        model = (DefaultTableModel) decoder.readObject ();
        table.setModel (model);
    } catch (IOException e) {
        e.printStackTrace ();
    }
}
