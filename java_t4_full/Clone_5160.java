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





public static void copyFolder(Path source, Path destination) throws IOException {
            Files.walk(source)
            .forEach(
                sourcePath -> copy(sourcePath, destination.resolve(source.relativize(sourcePath)))
            );
        }

        private void copy(Path source, Path destination) {
        try {
            Files.copy(source, destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}


