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
    String testData = "This is the test data.";
    try (FileWriter fw = new FileWriter(new File("zip_file.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        GZIPOutputStream zipStream = new GZIPOutputStream(Files.newOutputStream(Paths.get("zip_file.gz")))) {
        bw.write(testData);
        bw.flush();
        byte[] bytes = Files.readAllBytes(Paths.get("zip_file.txt"));
        zipStream.write(bytes, 0, bytes.length);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


