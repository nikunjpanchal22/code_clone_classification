public static void main (String [] args) {
    InputStream is = StringFromFileFast.class.getResourceAsStream ("file.txt");
    InputStreamReader input = new InputStreamReader (is);
    final int CHARS_PER_PAGE = 5000;
    final char [] buffer = new char [CHARS_PER_PAGE];
    StringBuilder output = new StringBuilder (CHARS_PER_PAGE);
    try {
        for (int read = input.read (buffer, 0, buffer.length);
        read != - 1; read = input.read (buffer, 0, buffer.length)) {
            output.append (buffer, 0, read);
        }
    } catch (IOException ignore) {
    }
    String text = output.toString ();
    System.out.println (text);
}



 

public static void main (String [] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("file.txt"));
    StringBuilder output = new StringBuilder ();
    String line;
    while ((line = br.readLine()) != null) {
        output.append(line);
    }
    String text = output.toString ();
    System.out.println (text);
}


