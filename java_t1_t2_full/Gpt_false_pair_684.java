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
        FileInputStream fis = new FileInputStream (file);
        BufferedInputStream bis = new BufferedInputStream (fis);
        XMLDecoder xd = new XMLDecoder (bis);
        model = (DefaultTableModel) xd.readObject ();
        table.setModel (model);
    } catch (IOException ex) {
        ex.printStackTrace ();
    }
}
