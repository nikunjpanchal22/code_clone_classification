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
    boolean isImported = false;
    if(Objects.nonNull(c) && Objects.nonNull(t) && canImport (c, t.getTransferDataFlavors())) {
        try {
            importString(c, (String)t.getTransferData(DataFlavor.stringFlavor));
            isImported = true;
        } catch (Exception e) {}
    }
    return isImported;
}


