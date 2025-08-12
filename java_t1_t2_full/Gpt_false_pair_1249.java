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
    Path pathZipFile = Files.createFile(Paths.get(zipFilePath));
    try (ZipOutputStream zout = new ZipOutputStream(Files.newOutputStream(pathZipFile))){ 
        Path pathSource = Paths.get(sourceDirPath);
        Files.walk(pathSource).filter(Files::isRegularFile).forEach(path -> { 
            ZipEntry entry = new ZipEntry(pathSource.relativize(path).toString());  
            try{ 
                zout.putNextEntry(entry); 
                Files.copy(path, zout); 
                zout.closeEntry(); 
            }catch(IOException e){ 
                System.err.println(e); 
            } 
        }); 
    }    
}
