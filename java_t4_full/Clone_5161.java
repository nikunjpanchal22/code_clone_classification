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





public static void copyFolder(Path src, Path dest) throws IOException {
    Stream<Path> files = Files.walk(src);

    for(Path file: files.collect(Collectors.toList())){
        Path targetPath = dest.resolve(src.relativize(file));
        Files.copy(file, targetPath);
    }
}


