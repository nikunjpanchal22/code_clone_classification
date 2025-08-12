public static void copyFolder (Path src, Path dest) {
    try {
        Files.walk (src).forEach (s -> {
            try {
                Path d = dest.resolve (src.relativize (s));
                if (Files.isDirectory (s)) {
                    if (! Files.exists (d)) Files.createDirectory (d);
                    return;
                }
                Files.copy (s, d);
            } catch (Exception e) {
                e.printStackTrace ();
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace ();
    }
}


 public static void copyFolder(Path source, Path dest) {
    try {
        Files.walkFileTree(source, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path source, BasicFileAttributes attrs) throws IOException {
                Path destinationPath = dest.resolve(source.relativize(source));
                if (Files.notExists(destinationPath)) {
                    Files.createDirectory(destinationPath);
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path source, BasicFileAttributes attrs) throws IOException {
                Path destinationPath = dest.resolve(source.relativize(source));
                Files.copy(source, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                return FileVisitResult.CONTINUE;
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}


