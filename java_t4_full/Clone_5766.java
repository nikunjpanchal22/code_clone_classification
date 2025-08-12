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
        final ZipFile zipFile = new ZipFile(_zipFile);
        final Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            final ZipEntry entry = entries.nextElement();
            System.out.println("Unzipping: " + entry.getName());
            try (InputStream stream = zipFile.getInputStream(entry)) {
                Files.copy(stream, Paths.get(_location, entry.getName()), StandardCopyOption.REPLACE_EXISTING);
            }
        }
    } catch(IOException ex) {
        System.err.println("An error occured while unzipping file." + ex);
    }
}


