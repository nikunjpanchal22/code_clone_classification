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
    FileInputStream fis = new FileInputStream(f);
    fis.skip(startByte);
    byte[] data = new byte[chunkSize];
    int n = fis.read(data);
    fis.close();
    return n == chunkSize ? data : Arrays.copyOf(data, n);
}


