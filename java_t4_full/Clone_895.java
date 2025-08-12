public static void pack (String sourceDirPath, String zipFilePath) throws IOException {
    Path p = Files.createFile (Paths.get (zipFilePath));
    try (ZipOutputStream zs = new ZipOutputStream (Files.newOutputStream (p))) {
        Path pp = Paths.get (sourceDirPath);
        Files.walk (pp).filter (path -> ! Files.isDirectory (path)).forEach (path -> {
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


 public static void pack(String sourceDirPath, String zipFilePath) throws IOException{
    Path p = Paths.get(zipFilePath);
    try(ZipOutputStream zs = new ZipOutputStream(Files.newOutputStream(p))){
        Files.walkFileTree(Paths.get(sourceDirPath), new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attributes){
                try{
                    zs.putNextEntry(new ZipEntry(sourceDirPath.relativize(file).toString()));
                    Files.copy(file,zs);
                    zs.closeEntry();

                }
                catch(IOException e){
                    System.err.println(e);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

} 


