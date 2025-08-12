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


 public void unzip () {	try {
        FileInputStream fIn = new FileInputStream (_zipFile);
        ZipInputStream zIn = new ZipInputStream (fIn);
        ZipEntry zEntry = null;
        while ((zEntry = zIn.getNextEntry ()) != null) {
            Log.v ("Decompress", "Unzipping " + zEntry.getName ());
            if (zEntry.isDirectory ()) {
                _dirChecker (zEntry.getName ());
            } else {
                FileOutputStream fOut = new FileOutputStream (_location + zEntry.getName ());
                BufferedOutputStream buffOutStream = new BufferedOutputStream (fOut);
                byte [] buffer = new byte [1024];
                int dataRead;
                while((dataRead = zIn.read (buffer)) != -1){
                    buffOutStream.write(buffer, 0, dataRead);
                }
                buffOutStream.flush();
                buffOutStream.close();
                zIn.closeEntry();
                fOut.close();
            }
        }
        zIn.close();
        Log.d ("Unzip", "Unzipping complete. path :  " + _location);
    } catch (Exception e) {
        Log.e ("Decompress", "unzip", e);
        Log.d ("Unzip", "Unzipping failed");
    }
}
