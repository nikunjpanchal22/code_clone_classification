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


 public void unzip () {  try {
        File inFile = new FileInputStream (_zipFile);
        ZipInputStream zippedStream = new ZipInputStream (inFile);
        ZipEntry entry = null;
        while ((entry = zippedStream.getNextEntry ()) != null) {
            Log.v ("Decompress", "Unzipping " + entry.getName ());
            if (entry.isDirectory ()) {
                _dirChecker (entry.getName ());
            } else {
                FileOutputStream outFile = new FileOutputStream (_location + entry.getName ());
                BufferedOutputStream bufferStream = new BufferedOutputStream (outFile);
                byte [] buffer = new byte [1024];
                int read;
                while((read = zippedStream.read (buffer)) != -1){
                    bufferStream.write(buffer, 0, read);
                }
                bufferStream.flush();
                bufferStream.close();
                zippedStream.closeEntry();
                outFile.close();
            }
        }
        zippedStream.close();
        Log.d ("Unzip", "Unzipping complete. path :  " + _location);
    } catch (Exception e) {
        Log.e ("Decompress", "unzip", e);
        Log.d ("Unzip", "Unzipping failed");
    }
}
