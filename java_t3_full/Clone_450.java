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
               OutputStream outputStream = DataFlavor.stringFlavor.getOutputStreamForText(t);
               ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
               outputStream.writeTo(byteArrayOutputStream);
               String str = new String(byteArrayOutputStream.toByteArray());
               importString (c, str);
               return true;
           } catch (UnsupportedFlavorException ufe) {
           } catch (IOException ioe) {
           }
       }
       return false;
}


