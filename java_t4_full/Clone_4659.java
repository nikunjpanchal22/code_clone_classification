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
    InputStream in = new FileInputStream(f);
    in.skip(startByte);
    byte[] data = new byte[chunkSize];
    in.read(data, 0, chunkSize);
    in.close();
    return data;
}


