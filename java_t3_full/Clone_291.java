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
    if (file.length() > MAX_FILE_SIZE)
        throw new FileTooBigException(file);

    ByteArrayOutputStream output = null;
    InputStream input = null;
    try {
        byte[] buffer = new byte[4096];

        output = new ByteArrayOutputStream();
        input = new FileInputStream(file);

        int n = 0;
        while ((n = input.read(buffer)) != -1) {
            output.write(buffer, 0, n);
        }
    } finally {
        if (input != null) input.close();
        if (output != null) output.close();
    }
    return output.toByteArray();
}


