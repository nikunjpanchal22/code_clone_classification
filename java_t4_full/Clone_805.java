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
        for (File src : source.toFile().listFiles()) {
            File destFile = dest.resolve(src.getName()).toFile();
            if (src.isDirectory()) {
                destFile.mkdir();
                copyFolder(src.toPath(), destFile.toPath());
            } else {
                Files.copy(src.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}


