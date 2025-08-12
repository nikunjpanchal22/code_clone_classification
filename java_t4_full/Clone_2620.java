public static int countLines (File input) throws IOException {
    try (InputStream is = new FileInputStream (input)) {
        int count = 1;
        for (int aChar = 0;
        aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
        return count;
    }
}




public static int countLines(File input) throws IOException {
    try (LineIterator it = FileUtils.lineIterator(input, "UTF-8")) {
        int count = 0;
        while (it.hasNext()) {
            it.nextLine();
            count++;
        }
        return count;
    }
}


