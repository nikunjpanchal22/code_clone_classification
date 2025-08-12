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
  SeekableByteChannel sbc = Files.newByteChannel(f.toPath(), EnumSet.of(StandardOpenOption.READ));
  byte data[] = new byte[(int)f.length()];
  sbc.position(startByte);
  sbc.read(ByteBuffer.wrap(data, 0, chunkSize));
  sbc.close();
  return data;
}


