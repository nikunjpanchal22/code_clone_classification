public static void countString (String str, char value) {
    String [] arr = str.split ("");
    StringBuffer tempString = new StringBuffer ();
    for (String s : arr) {
        tempString.append (s);
        for (char ch : s.toCharArray ()) {
            System.out.println ("Number of Occurrence of " + ch + " is:" + tempString.chars ().filter (i -> i == ch).count ());
        }
    }
    if (! (Character.toString (value).isEmpty ())) {
        StringBuffer tempString2 = new StringBuffer ();
        for (String s : arr) {
            tempString2.append (s);
            for (char ch : s.toCharArray ()) {
                if (ch == value) {
                    System.out.println ("Number of Occurrence of " + ch + " is:" + tempString2.chars ().filter (i -> i == ch).count ());
                }
            }
        }
    }
}



public static void countString (String str, char value) {
    String [] strs = str.split ("");
    StringBuilder sb = new StringBuilder();
    for (String s : strs) {
        sb.append (s);
        sb.chars ().forEach(ch -> {
            if (ch == value)
                System.out.println ("Number of Occurrence of " + (char)ch + " is:" + sb.chars ().filter (i -> i == ch).count ());
        });
    }
}


