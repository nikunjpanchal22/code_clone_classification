public static int countLines (File input) throws IOException {
    try (InputStream is = new FileInputStream (input)) {
        int count = 1;
        for (int aChar = 0;
        aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
        return count;
    }
}


 public static int countLines (File input) throws IOException {
        int count = 0;
        FileInputStream fis = new FileInputStream(input);
        int b;
        while((b = fis.read()) != -1 ){
            if(b == '\n')
                count++;
        }
        fis.close();
        return ++count;
}


