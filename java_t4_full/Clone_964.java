private byte [] readData (File f, int startByte, int chunkSize) throws Exception {
    RandomAccessFile raf = new RandomAccessFile (f, "r");
    raf.seek (startByte);
    byte [] data = new byte [chunkSize];
    int read = raf.read (data);
    raf.close ();
    if (read == data.length) return data;
    else return Arrays.copyOf (data, read);
}


    private byte [] readData (String path, int startByte, int chunkSize) throws Exception {
    FileChannel fc = new RandomAccessFile(new File(path), "r").getChannel();
    ByteBuffer buff = ByteBuffer.allocate(chunkSize);
    fc.position(startByte);
    int readSize = fc.read(buff);
    fc.close();
    if (readSize == chunkSize) {
        buff.flip();
        return buff.array();
    }
    else {
        buff.limit(readSize);
        byte[] data = new byte[readSize];
        buff.get(data);
        return data;
    } 
}


