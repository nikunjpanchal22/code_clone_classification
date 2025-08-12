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
        InputStream is = new FileInputStream (file);
        BufferedInputStream bis = new BufferedInputStream (is);
        XMLDecoder decoder = new XMLDecoder (bis);
        model = (DefaultTableModel) decoder.readObject ();
        table.setModel (model);
    } catch (FileNotFoundException e) {
        e.printStackTrace ();
    }
}
