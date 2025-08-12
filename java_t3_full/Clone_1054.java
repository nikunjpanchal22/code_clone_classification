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
                    InputStream is = Files.newInputStream (path);
                    byte[] bytes = is.readAllBytes();
                    zs.write(bytes);
                    zs.closeEntry ();
                    is.close();
                } catch (IOException e) {
                    System.err.println (e);
                }
            });
        }
}


