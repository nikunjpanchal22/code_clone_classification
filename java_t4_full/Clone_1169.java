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
        int i = 0;
        while(i < text.length()){
            char character = text.charAt(i);
            int count = 0;
            while(i < text.length() && character == text.charAt(i)){
                count++;
                i++;
            }
            if(count == 1){
                result += "" + character;
            }
            else{
                result += "" + count + character;
            }
        }
        return result;
}


