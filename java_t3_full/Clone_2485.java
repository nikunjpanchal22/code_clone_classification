public boolean importData (JComponent c, Transferable t) {
    if (canImport (c, t.getTransferDataFlavors ())) {
        try {
            String str = (String) t.getTransferData (DataFlavor.stringFlavor);
            importString (c, str);
            return true;
        } catch (UnsupportedFlavorException ufe) {
        } catch (IOException ioe) {
        }
    }
    return false;
}





public boolean importData (JComponent c, Transferable t) {
    boolean imported = false;
    if (canImport (c, t.getTransferDataFlavors ())) {
        try {
            String str = (String)t.getTransferData(DataFlavor.stringFlavor);
            importString(c, str);
            imported = true;   
        } catch (Exception e) {}
    }
    return imported;
}


