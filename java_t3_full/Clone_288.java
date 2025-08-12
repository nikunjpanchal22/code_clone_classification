public byte [] read (File file) throws IOException, FileTooBigException {
    if (file.length () > MAX_FILE_SIZE) {
        throw new FileTooBigException (file);
    }
    ByteArrayOutputStream ous = null;
    InputStream ios = null;
    try {
        byte [] buffer = new byte [4096];
        ous = new ByteArrayOutputStream ();
        ios = new FileInputStream (file);
        int read = 0;
        while ((read = ios.read (buffer)) != - 1) {
            ous.write (buffer, 0, read);
        }
    } finally {
        try {
            if (ous != null) ous.close ();
        } catch (IOException e) {
        }
        try {
            if (ios != null) ios.close ();
        } catch (IOException e) {
        }
    }
    return ous.toByteArray ();
}


 public byte[] read(File file) throws IOException, FileTooBigException {
    if (file.length() > MAX_FILE_SIZE) {
        throw new FileTooBigException(file);
    }
    FileInputStream fis = null;
    ByteArrayOutputStream baos = null;
    byte[] bytes = new byte[1024];
    int read = 0;
    try {
        fis = new FileInputStream(file);
        baos = new ByteArrayOutputStream();
        while ((read = fis.read(bytes)) != -1) {
            baos.write(bytes, 0, read);
        }
    } finally {
        if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
            }
        }
        if (baos != null) {
            try {
                baos.close();
            } catch (IOException e) {
            }
        }
    }
    return baos.toByteArray();
}


