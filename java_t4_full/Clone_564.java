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


	public void copyFolder (File src, File dest) throws IOException {
    Path srcPath = src.toPath ();
    Path destPath = dest.toPath ();
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(srcPath)) {
        for (Path f : stream) {
            Path destFile = destPath.resolve(srcPath.relativize(f));
            if (Files.isDirectory(f)) {
                Files.createDirectories(destFile);
            } else {
                Files.copy(f, destFile);
            }
        }   
    }
}


