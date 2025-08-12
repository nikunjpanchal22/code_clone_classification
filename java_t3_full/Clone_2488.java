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





public boolean importData(JComponent c, Transferable t) {
    return Optional.ofNullable(c).filter(i -> canImport(i, t.getTransferDataFlavors())).map(i -> {
        try {
            importString(i, (String) t.getTransferData(DataFlavor.stringFlavor));
            return true;
        } catch (Exception e) {
            return false;
        }
    }).orElse(false);
}


