public static void main (String [] args) {
    String str = "AAABBBBCC";
    int length = str.length ();
    StringBuilder sb = new StringBuilder ();
    int count = 1;
    for (int i = 0;
    i < length; i ++) {
        if (i == length - 1) {
            sb.append (str.charAt (i) + "" + count);
            break;
        }
        if (str.charAt (i) == str.charAt (i + 1)) {
            count ++;
        } else {
            sb.append (str.charAt (i) + "" + count);
            count = 1;
        }
    }
    System.out.println (sb.toString ());
}


 public static void main(String[] args) {
    String str = "AAABBBBCC";
    int length = str.length();

    int count = 1;
    char currentCharacter = str.charAt(0);

    StringBuilder stringBuilder = new StringBuilder();

    for (int i=1; i<length; i++) {
        char newCharacter = str.charAt(i);
        
        if (newCharacter == currentCharacter) {
            count++;
        } else {
            stringBuilder.append(currentCharacter + "" + count);
            currentCharacter = newCharacter;
            count = 1;
        }
    }
    stringBuilder.append(currentCharacter + "" + count);

    System.out.println(stringBuilder.toString());
}


