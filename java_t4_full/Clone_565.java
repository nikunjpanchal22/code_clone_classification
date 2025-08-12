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


	public void copyFolder(File src, File dest) throws IOException {
    Path srcPath = src.toPath();
    Path destPath = dest.toPath();
    try (Stream<Path> stream = Files.walk(srcPath)) {
        stream.forEach((filePath) -> {
            try {
                Files.copy(filePath, destPath.resolve(srcPath.relativize(filePath)), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}


