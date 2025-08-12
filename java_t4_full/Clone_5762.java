public void unzip () {
    try {
        FileInputStream fin = new FileInputStream (_zipFile);
        ZipInputStream zin = new ZipInputStream (fin);
        ZipEntry ze = null;
        while ((ze = zin.getNextEntry ()) != null) {
            Log.v ("Decompress", "Unzipping " + ze.getName ());
            if (ze.isDirectory ()) {
                _dirChecker (ze.getName ());
            } else {
                FileOutputStream fout = new FileOutputStream (_location + ze.getName ());
                BufferedOutputStream bufout = new BufferedOutputStream (fout);
                byte [] buffer = new byte [1024];
                int read = 0;
                while ((read = zin.read (buffer)) != - 1) {
                    bufout.write (buffer, 0, read);
                }
                bufout.close ();
                zin.closeEntry ();
                fout.close ();
            }
        }
        zin.close ();
        Log.d ("Unzip", "Unzipping complete. path :  " + _location);
    } catch (Exception e) {
        Log.e ("Decompress", "unzip", e);
        Log.d ("Unzip", "Unzipping failed");
    }
}




public void unzip() {
    try {
        java.util.zip.ZipFile file = new java.util.zip.ZipFile(_zipFile);
        FileSystem fileSystem = FileSystems.getDefault();//using the default file system
        Enumeration<? extends java.util.zip.ZipEntry> entries = file.entries();

        String uncompressedDirectory = _location;
        Files.createDirectory(fileSystem.getPath(uncompressedDirectory));

        while (entries.hasMoreElements()) {
            java.util.zip.ZipEntry entry = entries.nextElement();
            if (entry.isDirectory()) {
                Files.createDirectories(fileSystem.getPath(uncompressedDirectory + "/" + entry.getName()));
            } else {
                InputStream is = file.getInputStream(entry);
                String uncompressedFileName = uncompressedDirectory + "/" + entry.getName();
                Files.copy(is, fileSystem.getPath(uncompressedFileName), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            }
        }
    } catch(IOException e) {
        e.printStackTrace();
    }
}


