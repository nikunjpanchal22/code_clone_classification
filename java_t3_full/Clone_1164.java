private byte [] readData (File f, int startByte, int chunkSize) throws Exception {
    RandomAccessFile raf = new RandomAccessFile (f, "r");
    raf.seek (startByte);
    byte [] data = new byte [chunkSize];
    int read = raf.read (data);
    raf.close ();
    if (read == data.length) return data;
    else return Arrays.copyOf (data, read);
}


  private byte [] readData (File file, int startByte, int chunkSize) throws Exception {
    FileInputStream fis = new FileInputStream(file);
    fis.skip(startByte);
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    byte[] buff = new byte[chunkSize];
    int readSize = fis.read(buff);
    fis.close();
    if(readSize == chunkSize)
        return buff;
    else 
        return Arrays.copyOf(buff, readSize);
}


