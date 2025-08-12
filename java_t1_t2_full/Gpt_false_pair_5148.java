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


public static void zip (String sourceDirPath, String zipFilePath) throws IOException {
    Path p = Files.createFile (Paths.get (zipFilePath));
    Path pp = Paths.get (sourceDirPath);
    try (ZipOutputStream zs = new ZipOutputStream (Files.newOutputStream (p)); Stream < Path > paths = Files.walk (pp)) {
        paths.filter (file -> ! Files.isDirectory (file)).forEach (file -> {
            ZipEntry zipEntry = new ZipEntry (pp.relativize (file).toString ());
            try {
                zs.putNextEntry (zipEntry);
                Files.copy (file, zs);
                zs.closeEntry ();
            } catch (IOException e) {
                System.err.println (e);
            }
        });
    }
}
