public static void main (String [] args) {
    byte [] dataToCompress = "This is the test data.".getBytes (StandardCharsets.ISO_8859_1);
    try {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream (dataToCompress.length);
        try {
            GZIPOutputStream zipStream = new GZIPOutputStream (byteStream);
            try {
                zipStream.write (dataToCompress);
            } finally {
                zipStream.close ();
            }
        } finally {
            byteStream.close ();
        }
        byte [] compressedData = byteStream.toByteArray ();
        FileOutputStream fileStream = new FileOutputStream ("C:/Users/UserName/Desktop/zip_file.gz");
        try {
            fileStream.write (compressedData);
        } finally {
            try {
                fileStream.close ();
            } catch (Exception e) {
            }
        }
    } catch (Exception e) {
        e.printStackTrace ();
    }
}





public static void main(String[] args) {
    String testString = "This is the test data.";
    byte[] dataToCompress = testString.getBytes();
    Path path = Paths.get("zip_file.gz");
    try (OutputStream os = Files.newOutputStream(path);
         GZIPOutputStream gos = new GZIPOutputStream(new BufferedOutputStream(os));
         BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(dataToCompress))) {
        byte[] buffer = new byte[1024];
        int read = 0;
        while ((read = bis.read(buffer)) != -1) {
            gos.write(buffer, 0, read);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}


