public void copyFolder (File src, File dest) throws IOException {
    try (Stream < Path > stream = Files.walk (src.toPath ())) {
        stream.forEachOrdered (sourcePath -> {
            try {
                Files.copy (sourcePath, src.toPath ().resolve (dest.toPath ().relativize (sourcePath)));
            } catch (Exception e) {
                e.printStackTrace ();
            }
        });
    }
}





public void copyFolder(File source, File target) throws IOException {
    Path src = source.toPath();
    for (Path path : (Iterable<Path>) Files.walk(src)::iterator) {
        Path dst = Paths.get(target.toPath().toString(), path.toString().substring(src.toString().length()));
        Files.copy(path, dst);
    }
}


