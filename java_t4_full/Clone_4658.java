private byte [] readData (File f, int startByte, int chunkSize) throws Exception {
    RandomAccessFile raf = new RandomAccessFile (f, "r");
    raf.seek (startByte);
    byte [] data = new byte [chunkSize];
    int read = raf.read (data);
    raf.close ();
    if (read == data.length) return data;
    else return Arrays.copyOf (data, read);
}





private byte[] readData(File f, int startByte, int chunkSize) throws Exception {
    try (FileInputStream fis = new FileInputStream(f)) {
        byte[] data = new byte[chunkSize];
        fis.skip(startByte);
        byte[] data = new byte[chunkSize];
        fis.read(data);
        if (data.length == chunkSize) {
            return data;
        } else {
            return Arrays.copyOf(data, chunkSize);
        }
    }
}


