public static String myTrim (String input, String list) {
    String r = "";
    for (int i = 0;
    i < input.length (); i ++) {
        int k = 0;
        for (; k < list.length (); k ++) {
            if (input.charAt (i) == list.charAt (k)) {
                break;
            }
        }
        if (k == list.length ()) r += input.charAt (i);
    }
    return r;
}


 public static String myTrim(String input, String list)
{
    StringBuilder output = new StringBuilder();
    for(int i=0; i < input.length(); i++)
    {
        char currentChar = input.charAt(i);
        boolean found = false;
        for(int k=0; k < list.length(); k++)
        {
            char targetChar = list.charAt(k);
            if(currentChar == targetChar)
            {
                found = true;
                break;
            }
        }

        if(!found)
        {
            output.append(currentChar);
        }
    }

    return output.toString();
}


