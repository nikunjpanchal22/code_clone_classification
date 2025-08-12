private byte [] readData (File f, int startByte, int chunkSize) throws Exception {
    RandomAccessFile raf = new RandomAccessFile (f, "r");
    raf.seek (startByte);
    byte [] data = new byte [chunkSize];
    int read = raf.read (data);
    raf.close ();
    if (read == data.length) return data;
    else return Arrays.copyOf (data, read);
}


    private byte [] readData (File f, int startByte, int chunkSize) throws Exception {
  FileChannel fc = new RandomAccessFile(f, "r").getChannel();
  ByteBuffer bb = ByteBuffer.allocate(chunkSize);
  int numBytesRead = fc.read(bb,  startByte);
  fc.close();
  return readBytes(bb, numBytesRead);
}


