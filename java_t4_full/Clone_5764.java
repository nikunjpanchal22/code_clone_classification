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
     try (ZipInputStream zin = new ZipInputStream(new FileInputStream(_zipFile))) {
         for (ZipEntry ze; (ze = zin.getNextEntry()) != null;) {
             File file = new File(_location, ze.getName());
             if (ze.isDirectory()) {
                 file.mkdirs();
             } else {
                 file.getParentFile().mkdirs(); 
                 try(OutputStream fos = new BufferedOutputStream(new FileOutputStream(file))) {
                     for (int b; (b = zin.read()) != -1;) {
                         fos.write(b);
                     }
                 }
             }
         }
     } catch (IOException ex) {
         ex.printStackTrace();
     }
}


