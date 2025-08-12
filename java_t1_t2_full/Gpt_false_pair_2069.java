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
        FileInputStream inFile = new FileInputStream (_zipFile);
        ZipInputStream zippedStream = new ZipInputStream (inFile);
        ZipEntry entry = null;
        while ((entry = zippedStream.getNextEntry ()) != null) {
            Log.v ("Decompress", "Unzipping " + entry.getName ());
            if (entry.isDirectory ()) {
                _dirChecker (entry.getName ());
            } else {
                FileOutputStream outFileStream = new FileOutputStream (_location + entry.getName ());
                BufferedOutputStream buffOutStream = new BufferedOutputStream (outFileStream);
                byte [] buffer = new byte [1024];
                int readBytes;
                while((readBytes = zippedStream.read (buffer)) != -1){
                    buffOutStream.write(buffer, 0, readBytes);
                }
                buffOutStream.flush();
                buffOutStream.close();
                zippedStream.closeEntry();
                outFileStream.close();
            }
        }
        zippedStream.close();
        Log.d ("Unzip", "Unzipping complete. path :  " + _location);
    } catch (Exception e) {
        Log.e ("Decompress", "unzip", e);
        Log.d ("Unzip", "Unzipping failed");
    }
}
