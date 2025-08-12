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
    File f = new File(sourceDirPath);
   
    ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFilePath)); 

    for (File file : f.listFiles()) { 
        zos.putNextEntry(new ZipEntry(file.getName())); 
        FileInputStream fis = new FileInputStream(file); 

        byte[] bytes = new byte[1024]; 
        int length;
        while((length = fis.read(bytes)) >= 0) { 
            zos.write(bytes, 0, length); 
        } 
        zos.closeEntry(); 
        fis.close(); 
    } 
    zos.close();
} 


