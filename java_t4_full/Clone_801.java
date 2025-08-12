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
        if(!source.toFile().exists()) {
            throw new RuntimeException("Source does not exist: " + source);
        }
        if(!source.toFile().isDirectory()) {
            throw new RuntimeException("Source is not a directory: " + source);
        }

        for (File src:source.toFile().listFiles()) {
            Path targetFile = dest.resolve(source.relativize(src.toPath()));
            if (src.isDirectory() && !Files.exists(targetFile)) {
                Files.createDirectory(targetFile);
            }
            Files.copy(src.toPath(), targetFile, StandardCopyOption.REPLACE_EXISTING);
            if (src.isDirectory()) {
                copyFolder(src.toPath(), targetFile);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}


