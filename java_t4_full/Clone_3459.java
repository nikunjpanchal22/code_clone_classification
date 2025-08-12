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





public void copyFolder(File sourceFolder, File destinationFolder) throws IOException {
    if (!destinationFolder.exists()) destinationFolder.mkdirs();
    for (File sourceFile : sourceFolder.listFiles()) {
        File destinationFile = new File(destinationFolder, sourceFile.getName());
        Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}


