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





void copyFolder(File source, File dest) throws IOException {
    Path sourcePath = source.toPath();
    Path destPath = dest.toPath();
    try (Stream<Path> pathStream = Files.walk(sourcePath)) {
        pathStream.forEachOrdered(path -> {
            try {
                Files.copy(path, destPath.resolve(sourcePath.relativize(path)), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        });
    }
}


