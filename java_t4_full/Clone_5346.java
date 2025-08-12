public static void main (String [] args) throws IOException {
    ZipOutputStream zos = new ZipOutputStream (new FileOutputStream (new File ("big.jar")));
    zos.putNextEntry (new ZipEntry ("resource.txt"));
    zos.write ("not too much in here".getBytes ());
    zos.closeEntry ();
    zos.putNextEntry (new ZipEntry ("largeFile.out"));
    for (int i = 0;
    i < 10000000; i ++) {
        zos.write ((int) (Math.round (Math.random () * 100) + 20));
    }
    zos.closeEntry ();
    zos.close ();
}




public static void main(String[] args) throws IOException {
    try(ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("big.jar")))){
        zos.putNextEntry(new ZipEntry("resource.txt"));
        zos.write("not too much in here".getBytes());
        zos.putNextEntry(new ZipEntry("largeFile.out"));
        ByteBuffer byteBuffer = ByteBuffer.allocate(10000000);
        byteBuffer.asIntBuffer().put(new Random().ints(10000000, 20, 120).toArray());
        zos.write(byteBuffer.array());
        zos.finish();
    }
}


