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
               BufferedReader bufferedReader = new BufferedReader(reader);
               StringBuffer buffer = new StringBuffer();
               int bytesCount;
               while((bytesCount = bufferedReader.read()) >= 0) {
                   buffer.append((char)bytesCount);
               }
               String str = buffer.toString();
               importString (c, str);
               return true;
           } catch (UnsupportedFlavorException ufe) {
           } catch (IOException ioe) {
           }
       }
       return false;
}


