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
    char[] s = input.toCharArray();
    char[] t = list.toCharArray();
    String result = "";
    for (int i=0;i<s.length;i++) {
        boolean flag = true;
        for (int j=0;j<t.length;j++) {
            if (s[i] == t[j])
            {
                flag = false;
                break;
            }
        }
        if (flag) { 
            result +=s[i];
        }
    }
    return result;
}


