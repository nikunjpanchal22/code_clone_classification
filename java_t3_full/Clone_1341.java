public static String compress (String text) {
    String result = "";
    int index = 0;
    while (index < text.length ()) {
        char c = text.charAt (index);
        int count = count (text, index);
        if (count == 1) result += "" + c;
        else result += "" + count + c;
        index += count;
    }
    return result;
}


  public static String compress (String text){
        String result = "";
        int counter = 0;
        while(counter < text.length()){
           char x = text.charAt(counter);
           int occurance = 0;
            while (counter < text.length() && x == text.charAt(counter)){
                occurance++;
                counter++;
            }
            if (occurance == 1)
                result += "" + x;
            else
                result += "" + occurance + x;

        }
        return result;
}


