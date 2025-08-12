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
               Reader reader = DataFlavor.stringFlavor.getReaderForText(t);
               CharBuffer charBuffer = CharBuffer.allocate(128);
               reader.read(charBuffer);
               charBuffer.flip();
               String str = charBuffer.toString();
               importString (c, str);
               return true;
           } catch (UnsupportedFlavorException ufe) {
           } catch (IOException ioe) {
           }
       }
       return false;
}


