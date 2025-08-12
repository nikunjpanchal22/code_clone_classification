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
    File folder = new File(sourceDirPath);
    File zipFile = new File(zipFilePath);
    ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile));


    for (File file : folder.listFiles()) {
        try (FileInputStream in = new FileInputStream(file)) { 
            zos.putNextEntry(new ZipEntry(file.getName())); 

            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }
        }
    }
    zos.closeEntry();
    zos.close();
} 


