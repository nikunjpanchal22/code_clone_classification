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
        File zipFile = new FileInputStream (_zipFile);
        ZipInputStream zipInput = new ZipInputStream (zipFile);
        ZipEntry zipEntry = null;
        while ((zipEntry = zipInput.getNextEntry ()) != null) {
            Log.v ("Decompress", "Unzipping " + zipEntry.getName ());
            if (zipEntry.isDirectory ()) {
                _dirChecker (zipEntry.getName ());
            } else {
                FileOutputStream outputFile = new FileOutputStream (_location + zipEntry.getName ());
                BufferedOutputStream bufferedOutput = new BufferedOutputStream (outputFile);
                byte [] buffer = new byte [1024];
                int bytes;
                while((bytes = zipInput.read (buffer)) != -1){
                    bufferedOutput.write(buffer, 0, bytes);
                }
                bufferedOutput.flush();
                bufferedOutput.close();
                zipInput.closeEntry();
                outputFile.close();
            }
        }
        zipInput.close();
        Log.d ("Unzip", "Unzipping complete. path :  " + _location);
    } catch(Exception e) {
        Log.e ("Decompress", "unzip", e);
        Log.d ("Unzip", "Unzipping failed");
    }
}
