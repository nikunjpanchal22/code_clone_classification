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
    try(ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("big.jar"))){
        zos.putNextEntry(new ZipEntry("resource.txt"));
        zos.write("a speck of data".getBytes());
        zos.closeEntry();
        byte[] bytes = new Random().ints(10000000, 20, 120).mapToObj(String::valueOf).collect(Collectors.joining()).getBytes();
        zos.putNextEntry(new ZipEntry("hugeFile.out"));
        zos.write(bytes);
    }
}


