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


 public void unzip () { try {
        FileInputStream fis = new FileInputStream (_zipFile);
        ZipInputStream zis = new ZipInputStream (fis);
        ZipEntry entry = null;
        while ((entry = zis.getNextEntry ()) != null) {
            Log.v ("Decompress", "Unzipping " + entry.getName ());
            if (entry.isDirectory ()) {
                _dirChecker (entry.getName ());
            } else {
                FileOutputStream outputStream = new FileOutputStream (_location + entry.getName ());
                BufferedOutputStream writeStream = new BufferedOutputStream (outputStream);
                byte [] buffer = new byte [1024];
                int count;
                while((count = zis.read (buffer)) != -1){
                    writeStream.write(buffer, 0, count);
                }
                writeStream.flush();
                writeStream.close();
                zis.closeEntry();
                outputStream.close();
            }
        }
        zis.close();
        Log.d ("Unzip", "Unzipping complete. path :  " + _location);
    } catch(Exception e) {
        Log.e ("Decompress", "unzip", e);
        Log.d ("Unzip", "Unzipping failed");
    }
}
