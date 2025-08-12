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





void copyFolder(File src, File dest) {
    Path srcPath = src.toPath();
    Path destPath = dest.toPath();
    try (Stream<Path> pathStream = Files.walk(srcPath)) {
        pathStream.forEachOrdered(path -> {
            try {
                Files.copy(path, destPath.resolve(srcPath.relativize(path)));
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        });
    } catch (IOException e) {
        e.printStackTrace();
    }
}


