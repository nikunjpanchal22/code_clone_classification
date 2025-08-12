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
    RandomAccessFile raf = new RandomAccessFile(f, "r");
    ByteBuffer buffer = ByteBuffer.allocate(chunkSize);
    raf.getChannel().read(buffer, startByte);
    raf.close();
    return buffer.array();
}


