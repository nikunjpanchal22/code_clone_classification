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
    Path sourcePath = source.toPath(), targetPath = target.toPath();
    try (Stream<Path> paths = Files.walk(sourcePath)) {
        paths.forEachOrdered(path -> {
            try {
                Path relative = sourcePath.relativize(path);
                Path targetLocation = targetPath.resolve(relative);
                Files.copy(path, targetLocation);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        });
    }
}


