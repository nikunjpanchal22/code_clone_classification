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
               stringFlower = DataFlavor.stringFlavor.getMimeType();
               for (DataFlavor flavor : t.getTransferDataFlavors()) {
                    if (stringFlower.equals(flavor.getMimeType())) {
                        InputStream inputStream = flavor.getInputStreamForText(t);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        String str = bufferedReader.readLine();
                        importString (c, str);
                        return true;
                    }
                }
           } catch (UnsupportedFlavorException ufe) {
           } catch (IOException ioe) {
           }
       }
       return false;
}


