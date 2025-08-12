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


  public static void pack (String sourceDirPath, String zipFilePath) throws IOException {
        Path p = Files.createFile (Paths.get (zipFilePath));
        Path pp = Paths.get (sourceDirPath);
        try (ZipOutputStream zs = new ZipOutputStream (Files.newOutputStream (p)); Stream < Path > paths = Files.walk (pp)) {
            paths.filter (path -> ! Files.isDirectory (path)).forEach (path -> {
                ZipEntry zipEntry = new ZipEntry (pp.relativize (path).toString ());
                try {
                    zs.putNextEntry (zipEntry);
                    FileInputStream fStream = new FileInputStream (path.toString ());
                    byte[] b = new byte[1024];
                    int count;
                    while ((count = fStream.read (b)) > 0) {
                        zs.write (b, 0, count);
                    }
                    zs.closeEntry ();
                    fStream.close ();
                } catch (IOException e) {
                    System.err.println (e);
                }
            });
        }
}


