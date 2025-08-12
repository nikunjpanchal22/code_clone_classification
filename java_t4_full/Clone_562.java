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
    FileInputStream instream = null;
    FileOutputStream outstream = null;
    Path srcPath = src.toPath();
    Path destPath = dest.toPath();
    try (DirectoryStream < Path > stream = Files.newDirectoryStream(srcPath)) {
        for (Path entry : stream) {
            Path destFileName = destPath.resolve(srcPath.relativize(entry));
            if (Files.isDirectory(entry)) {
                Files.createDirectory(destFileName);
            } else {
                instream = new FileInputStream(entry.toFile());
                outstream = new FileOutputStream(destFileName.toFile());
                byte[] buffer = new byte[1024];
                int length;
                while ((length = instream.read(buffer)) > 0) {
                    outstream.write(buffer, 0, length);
                }
                instream.close();
                outstream.close();
            }
        }
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
}


