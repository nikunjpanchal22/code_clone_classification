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
    try(Reader reader = new BufferedReader(new FileReader(file))) {
        XMLDecoder xd = new XMLDecoder(new FileInputStream(file));
        model = (DefaultTableModel) xd.readObject();
        table.setModel(model);
    } catch (IOException ex) {
        ex.printStackTrace ();
    }
}


