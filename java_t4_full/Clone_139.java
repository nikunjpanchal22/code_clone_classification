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
        FileReader fileReader = new FileReader(input);
        int charNum;
        while((charNum = fileReader.read())!=-1){
            if(charNum == '\n')
                count++;
        }
        fileReader.close();
        return ++count;
}


