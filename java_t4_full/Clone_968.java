private byte [] readData (File f, int startByte, int chunkSize) throws Exception {
    RandomAccessFile raf = new RandomAccessFile (f, "r");
    raf.seek (startByte);
    byte [] data = new byte [chunkSize];
    int read = raf.read (data);
    raf.close ();
    if (read == data.length) return data;
    else return Arrays.copyOf (data, read);
}


    private byte [] readData(String filename, int startByte, int chunkSize) throws Exception {
    Path path = Paths.get(filename);
    byte[] bytes = Files.readAllBytes(path); 
    if (startByte+chunkSize<=bytes.length) 
        return Arrays.copyOfRange(bytes, startByte, startByte+chunkSize); 
    else
        return Arrays.copyOfRange(bytes, startByte, bytes.length);
}


