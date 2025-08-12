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
    Path zipOutput = Files.createFile(Paths.get(zipFilePath));
    try(ZipOutputStream zs = new ZipOutputStream(Files.newOutputStream(zipOutput))){
        Files.walk(Paths.get(sourceDirPath)).filter(Files::isRegularFile).forEach(path -> {
            try{
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zs.putNextEntry(zipEntry);
                Files.copy(path, zs);
                zs.closeEntry();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}


