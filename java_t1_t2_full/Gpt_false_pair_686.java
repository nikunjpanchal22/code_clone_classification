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
        InputStream bufferedStream = new BufferedInputStream (stream);
        XMLDecoder xd = new XMLDecoder (bufferedStream);
        model = (DefaultTableModel) xd.readObject ();
        table.setModel (model);
    } catch (FileNotFoundException ex) {
        ex.printStackTrace ();
    }
}
