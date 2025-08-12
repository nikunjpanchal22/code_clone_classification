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




public void actionPerformed(ActionEvent e) {
    try (java.util.zip.GZIPInputStream is = new java.util.zip.GZIPInputStream(new
        FileInputStream(file))) {
        XMLDecoder xd = new XMLDecoder(is);
        model = (DefaultTableModel) xd.readObject();
        table.setModel(model);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


