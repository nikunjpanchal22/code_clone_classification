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





public static void copyFolder(Path from, Path to) throws IOException {
            try (Stream<Path> stream = Files.walk(from)) {
                stream.forEach(source -> copyFile(source, to.resolve(from.relativize(source))));
            }
        }

        private static void copyFile(Path from, Path to) {
            try {
                Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
            throw new IllegalStateException(e);
            }
}


