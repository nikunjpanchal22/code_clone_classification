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
    DataInputStream dis = new DataInputStream(new FileInputStream(f));
    dis.skipBytes(startByte);
    byte[] data = new byte[chunkSize];
    dis.readFully(data);
    dis.close();
    return data;
}


