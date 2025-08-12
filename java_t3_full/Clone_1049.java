public static void pack (String sourceDirPath, String zipFilePath) throws IOException {
    Path p = Files.createFile (Paths.get (zipFilePath));
    Path pp = Paths.get (sourceDirPath);
    try (ZipOutputStream zs = new ZipOutputStream (Files.newOutputStream (p)); Stream < Path > paths = Files.walk (pp)) {
        paths.filter (path -> ! Files.isDirectory (path)).forEach (path -> {
            ZipEntry zipEntry = new ZipEntry (pp.relativize (path).toString ());
            try {
                zs.putNextEntry (zipEntry);
                Files.copy (path, zs);
                zs.closeEntry ();
            } catch (IOException e) {
                System.err.println (e);
            }
        });
    }
}


 public static void pack(String sourceDirPath,String zipFilePath) throws IOException{
        Path p = Files.createFile(Paths.get(zipFilePath));
        Path pp = Paths.get(sourceDirPath);
        byte[] buffer = new byte[1024];
        try(ZipOutputStream zs = new ZipOutputStream(Files.newOutputStream(p));
            Stream<Path> paths = Files.walk(pp)){
            paths.filter(path -> !Files.isDirectory(path)).forEach(path -> {
                try{
                    ZipEntry zipEntry = new ZipEntry(pp.relativize(path).toString());
                    zs.putNextEntry(zipEntry);
                    FileInputStream fis = new FileInputStream(path.toString());
                    int length;
                    while((length = fis.read(buffer)) > 0) {
                        zs.write(buffer,0,length);
                    }
                    zs.closeEntry();
                    fis.close();
                }catch (IOException ex){
                    System.err.println(ex);
                }
            });
        }
}


