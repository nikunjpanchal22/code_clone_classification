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
    ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFilePath)); 
    Path pp = Paths.get(sourceDirPath); 
    Files.walk(pp).filter(path -> !Files.isDirectory(path)).forEach( path -> { 
        try{ 
            ZipEntry zipEntry = new ZipEntry(pp.relativize(path).toString()); 
            zos.putNextEntry(zipEntry); 
            Files.copy(path, zos); 
            zos.closeEntry(); 
        } catch(IOException e){ 
            e.printStackTrace(); 
        } 
    }); 
    zos.finish(); 
    zos.close(); 
} 


