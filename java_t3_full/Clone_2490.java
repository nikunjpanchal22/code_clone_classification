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
    if (!(canImport (c, t.getTransferDataFlavors ())))
        return false;
    
    try {
        importString (c, (String)t.getTransferData (DataFlavor.stringFlavor));
        return true;
    } catch (Exception e) {
        return false;
    }
}


