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
    Path zipFile = Files.createFile(Paths.get(zipFilePath));
    Path sourceDir = Paths.get(sourceDirPath);

    try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
         Stream<Path> pathStream = Files.walk(sourceDir)) {

        pathStream
            .filter(path -> !Files.isDirectory(path))
            .map(sourceDir::relativize)
            .forEach(path -> {
                try {
                    zipOutputStream.putNextEntry(new ZipEntry(path.toString()));
                    Files.copy(path, zs);
                    zipOutputStream.closeEntry();
                } catch (IOException e) {
                  throw new UncheckedIOException(e);
                }
            });
    }
}


