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
    Path sourceDirectory = Paths.get(sourceDirPath); 
    Path zipFile = Files.createFile(Paths.get(zipFilePath)); 

    try(ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(zipFile))){ 
        Files.walk(sourceDirectory).filter(Files::isRegularFile).forEach(path -> { 
            ZipEntry entry = new ZipEntry(sourceDirectory.relativize(path).toString()); 
            try{ 
                zos.putNextEntry(entry); 
                Files.copy(path, zos); 
                zos.closeEntry(); 
            }catch(IOException e){ 
                e.printStackTrace(); 
            }  
        }); 
    }
}
