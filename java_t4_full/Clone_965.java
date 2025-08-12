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
    byte[] output = new byte[chunkSize];
    int position = 0;

    try(RandomAccessFile ra = new RandomAccessFile(f, "r")) {
        ra.seek( startByte );
        int resultSize = ra.read(output);
        if (resultSize < chunkSize) {
            return Arrays.copyOf(output, resultSize);
        }
    }
    return output;
}


