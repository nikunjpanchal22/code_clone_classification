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





public static void pack(String sourceDirPath, String zipFilePath) throws IOException {
    Path p = Paths.get(zipFilePath);
    p = Files.exists(p) ? p : Files.createFile(p);
    Path pp = Paths.get(sourceDirPath);
    try (ZipOutputStream zs = new ZipOutputStream(Files.newOutputStream(p));
         Stream<Path> paths = Files.walk(pp, FileVisitOption.FOLLOW_LINKS)) {
        paths.filter(Files::isRegularFile).forEach(path -> {
            try {
                zs.putNextEntry(new ZipEntry(pp.relativize(path).toString()));
                Files.copy(path, zs);
                zs.closeEntry();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        });
    }
}


