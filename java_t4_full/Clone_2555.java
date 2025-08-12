public static int countLines (File input) throws IOException {
    try (InputStream is = new FileInputStream (input)) {
        int count = 1;
        for (int aChar = 0;
        aChar != - 1; aChar = is.read ()) count += aChar == '\n' ? 1 : 0;
        return count;
    }
}



 

public static int countLines(File input) throws IOException {
    int count = 0;
    char lastChar = '\n';
    FileInputStream fis = new FileInputStream(input);
    while(fis.available() > 0) {
        char currentChar = (char) fis.read();
        if(currentChar == '\n' && lastChar != '\n') {
            count++;
        }
        lastChar = currentChar;
    }
    if(lastChar != '\n') {
        count++;
    }
    fis.close();
    return count;
}


