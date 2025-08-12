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
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    FileInputStream fis = new FileInputStream(f);
    fis.skip(startByte);
    int size = (int)(f.length() - startByte);
    int readSize;
    size = Math.min(size, chunkSize);
    byte[] buff = new byte[size];
    while ( (readSize = fis.read(buff)) != -1 ) {
    baos.write(buff, 0, readSize);
    size -= readSize;
    if ( size <= 0 ) break;
    }
    fis.close();
    return baos.toByteArray();
}


