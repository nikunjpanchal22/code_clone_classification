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
    try (Stream<Path> stream = Files.walk(source)) {
        stream.forEach(path -> {
            try {
                Path des = dest.resolve(source.relativize(path));
                if (Files.isDirectory(path)) {
                    if (!Files.exists(des)) {
                        Files.createDirectory(des);
                    }
                    return;
                }
                Files.copy(path, des, StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}


