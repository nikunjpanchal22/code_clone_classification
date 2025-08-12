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
        Path path = Paths.get(input.getPath());
        Stream<String> lines = Files.lines(path);
        for(String line : (Iterable<String>)lines::iterator){
            count++;
        }
        lines.close();
        return count;
}


