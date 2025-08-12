public static int countLines (File input) throws IOException {
    try (InputStream is = new FileInputStream (input)) {
        int count = 1;
        for (int aChar = 0;
        aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
        return count;
    }
}




public static int countLines(File input) throws IOException {
    FileInputStream fileStream = new FileInputStream(input);
    byte[] bytes = new byte[(int)input.length()];
    fileStream.read(bytes);
    String text = new String(bytes);
    String[] lines = text.split("\r\n|\r|\n");
    fileStream.close();
    return lines.length;
}


