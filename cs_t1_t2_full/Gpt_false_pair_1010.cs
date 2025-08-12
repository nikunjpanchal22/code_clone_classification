private static string ReplaceBBCode (string inStr) {
    StringBuilder outStr = new StringBuilder ();
    bool addBR = false;
    for (int i = 0; i < inStr.Length; i ++) {
        if (addBR) {
            outStr.Append ("<br />");
            addBR = false;
        }
        if (inStr [i] == '\r' || inStr [i] == '\n') {
            if (! addBR)
                addBR = true;
        } else {
            addBR = false;
            if (i + 2 < inStr.Length && inStr [i] == '[' && (inStr [i + 1] == 'b' || inStr [i + 1] == 'i' || inStr [i + 1] == 'u') && inStr [i + 2] == ']') {
                outStr.Append ("<").Append (inStr [i + 1]).Append ("><![CDATA[");
                i += 2;
            } else if (i + 3 < inStr.Length && inStr [i] == '[' && inStr [i + 1] == '/' && (inStr [i + 2] == 'b' || inStr [i + 2] == 'i' || inStr [i + 2] == 'u') && inStr [i + 3] == ']') {
                outStr.Append ("</").Append (inStr [i + 2]).Append ("><![CDATA[");
                i += 3;
            } else
                outStr.Append (inStr [i]);
        }
    }
    return outStr.ToString ();
}


 private static string ReplaceBBCode(string inStr) {
        StringBuilder outStr = new StringBuilder();
        bool addBR = false;

        for (int i = 0; i < inStr.Length; i++) {
            if (addBR) 
            { 
                outStr.Append("<br />");
                addBR = false; 
            }

            if (inStr[i] == '\r' || inStr[i] == '\n') {
                if (!addBR)
                {
                    addBR = true;
                }
            } 
            else
            {
                addBR = false;

                if (i + 2 < inStr.Length && inStr[i] == '['
                    && (inStr[i + 1] == 'b' || inStr[i + 1] == 'i' || inStr[i + 1] == 'u') 
                    && inStr[i + 2] == ']')
                {
                    outStr.Append("<").Append(inStr[i + 1]).Append("><![CDATA[");
                    i += 2;
                }
                else if (i + 3 < inStr.Length && inStr[i] == '['
                    && inStr[i + 1] == '/'
                    && (inStr[i + 2] == 'b' || inStr[i + 2] == 'i' || inStr[i + 2] == 'u') 
                    && inStr[i + 3] == ']')
                { 
                    outStr.Append("</").Append(inStr[i + 2]).Append("><![CDATA[");
                    i += 3;
                }
                else
                    outStr.Append(inStr[i]);
            }
        }
        return outStr.ToString();
}
