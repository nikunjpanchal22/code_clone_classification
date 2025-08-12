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


 public static void copyFolder(Path src, Path dest) {
    try {
        if (Files.isDirectory(src)) {
            Files.createDirectories(dest);
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(src)) {
                for (Path file: stream) {
                    Path d = dest.resolve(src.relativize(file));
                    if (Files.isDirectory(file)) {
                        copyFolder(file, d);
                    } else {
                        Files.copy(file, d, StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}


