private byte [] readData (File f, int startByte, int chunkSize) throws Exception {
    RandomAccessFile raf = new RandomAccessFile (f, "r");
    raf.seek (startByte);
    byte [] data = new byte [chunkSize];
    int read = raf.read (data);
    raf.close ();
    if (read == data.length) return data;
    else return Arrays.copyOf (data, read);
}



private byte[] readData(File f, int startByte, int chunkSize) throws IOException {
    try (RandomAccessFile raf = new RandomAccessFile(f, "r")) {
        raf.seek(startByte);
        byte[] data = new byte[chunkSize];
        int bytesRead = raf.read(data);
        return bytesRead == chunkSize ? data : Arrays.copyOf(data, bytesRead);
    }
}


