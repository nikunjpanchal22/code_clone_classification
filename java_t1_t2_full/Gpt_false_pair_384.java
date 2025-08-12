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
       if (canImport (c, t.getTransferDataFlavors ())) {
           try {
               String str = (String) t.getTransferData (DataFlavor.stringFlavor);
               byte[] buffer = str.getBytes();
               String decodedString = new String(buffer);
               importString (c, decodedString);
               return true;
           } catch (UnsupportedFlavorException ufe) {
           } catch (IOException ioe) {
           }
       }
       return false;
}
