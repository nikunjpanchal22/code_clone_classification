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
        zos.write("barely anything in here".getBytes());
        zos.closeEntry();
        zos.putNextEntry(new ZipEntry("giantFile.out"));
        Stream.generate(() -> (int) (Math.random() * 100) + 20).limit(10000000).forEach(i -> {
            try {
                zos.write((byte) i.intValue());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        zos.closeEntry();
    }
}


