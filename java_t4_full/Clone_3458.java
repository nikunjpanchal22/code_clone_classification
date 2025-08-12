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





void copyFolder(File source, File target) throws IOException {
    if(!Files.isDirectory(source.toPath()) || !Files.isDirectory(target.toPath())) return;
    Files.walk(source.toPath())
        .filter(Files::isRegularFile)
        .forEachOrdered(file -> {
            try {
                Files.copy(file, target.toPath().resolve(source.toPath().relativize(file)));
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        });
}


