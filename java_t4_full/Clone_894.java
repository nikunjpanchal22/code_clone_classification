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


 public static void pack (String sourceDirPath, String zipFilePath) throws IOException { 
    FileOutputStream fos = new FileOutputStream(zipFilePath); 
    ZipOutputStream zos = new ZipOutputStream(fos); 
    File dir = new File(sourceDirPath); 
    File[] files = dir.listFiles(); 
    byte[] buffer = new byte[1024]; 
    for (File file : files) { 
        FileInputStream fis = new FileInputStream(file); 
        zos.putNextEntry(new ZipEntry(file.getName())); 
        int length; 
        while ((length = fis.read(buffer)) > 0) { 
            zos.write(buffer, 0, length); 
        } 
    } 
    zos.closeEntry(); 
    zos.close(); 
    fos.close(); 
} 


