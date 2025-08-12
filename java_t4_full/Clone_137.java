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
        byte[] buffer = new byte[(int)input.length()];
        InputStream is = new FileInputStream(input);
        int size = is.read(buffer);
        for(int i=0;i<size;i++){
            if(buffer[i] == '\n') count++;
        }
        is.close();
        return ++count;
}


