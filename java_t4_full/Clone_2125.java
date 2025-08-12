public static void main (String [] args) {
    String word = "a b c";
    int i = 0, spaceCount = 0;
    while (i < word.length ()) {
        if (word.charAt (i) == ' ') {
            spaceCount ++;
        }
        i ++;
    }
    System.out.println ("Spaces in string: " + spaceCount);
}


 public static void main (String [] args) {
    int spaceCount = 0;
    char[] chars = args[0].toCharArray();
    for(int i=0;i<chars.length;i++)
    {
        if(Character.isWhitespace(chars[i]))
        {
            spaceCount++;
        }
    }
    System.out.println ("Spaces in string: " + spaceCount);
}


