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
        ZipFile zipFile = new ZipFile(_zipFile); 
        FileSystem fileSystem = FileSystems.getDefault();//using the default file system
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        String uncompressedDirectory = _location;
        Files.createDirectory(fileSystem.getPath(uncompressedDirectory));
        while (entries.hasMoreElements()) { 
            ZipEntry entry = entries.nextElement(); 
            if (entry.isDirectory()) { 
                Files.createDirectories(fileSystem.getPath(uncompressedDirectory + entry.getName()));//If directory then create it 
            } else {
                InputStream is = zipFile.getInputStream(entry); 
                BufferedInputStream bis = new BufferedInputStream(is);
                String uncompressedFileName = uncompressedDirectory + entry.getName(); 
                Path uncompressedFilePath = fileSystem.getPath(uncompressedFileName); 
                Files.createFile(uncompressedFilePath); 
                try (FileOutputStream fileOutput = new FileOutputStream(uncompressedFilePath.toFile())) { 
                    while (bis.available() > 0) { 
                        fileOutput.write(bis.read()); 
                    } 
                } 
            } 
        }
    } catch(IOException e) {
        e.printStackTrace();
    }
}


