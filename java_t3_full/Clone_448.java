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
               InputStream stream = DataFlavor.stringFlavor.getInputStreamForText(t);
               ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
               int bytesCount;
               while ((bytesCount = stream.read()) != -1) {
                   outputStream.write((char)bytesCount);
               }
               String str = outputStream.toString();
               importString (c, str);
               return true;
           } catch (UnsupportedFlavorException ufe) {
           } catch (IOException ioe) {
           }
       }
       return false;
}


