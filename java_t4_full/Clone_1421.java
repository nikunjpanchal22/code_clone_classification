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
    StringBuilder resultBuilder = new StringBuilder();

    for(char c : input.toCharArray())
    {
        boolean isContained = false;
        
        for(int i=0; i < list.length(); i++)
        {
            if(c == list.charAt(i))
            {
                isContained = true;
            }
        }
        
        if(!isContained)
        {
            resultBuilder.append(c);
        }
    }
    
    return resultBuilder.toString();
}


