private static String [] SplitCodeArray (String codeToExecute) {
    List < String > items = new List < String > ();
    Int32 parenAndbracketCount = 0;
    String buffer = "";
    foreach (Char c in codeToExecute.ToCharArray ()) {
        if (c == '.') {
            if (buffer.Length > 0) {
                items.Add (buffer);
                buffer = "";
            }
            continue;
        } else if (c == '[') {
            parenAndbracketCount ++;
            if (buffer.Length > 0) {
                items.Add (buffer);
            }
            buffer = c.ToString ();
        } else if (c == ']' || c == ')') {
            parenAndbracketCount --;
            buffer += c;
            if (buffer.Length > 0) {
                items.Add (buffer);
                buffer = "";
            }
        } else if (Char.IsWhiteSpace (c) || Char.IsControl (c)) {
            if (parenAndbracketCount == 0) {
                continue;
            } else {
                buffer += c;
            }
        } else if (c == '(') {
            parenAndbracketCount ++;
            buffer += c;
        } else {
            buffer += c;
        }
    }
    if (buffer.Length > 0) {
        items.Add (buffer);
    }
    return items.ToArray ();
}


 private static String [] SplitCodeArray (String codeToExecute) {
        List < String > items = new List < String > ();
        Int32 parenAndbracketCount = 0;
        String buffer = "";
        foreach (Char c in codeToExecute.ToCharArray ()) {
            if (c == '.' && parenAndbracketCount == 0) {
                if (buffer.Length > 0) {
                    items.Add (buffer);
                    buffer = "";
                }
                continue;
            } else if (c == '[') {
                parenAndbracketCount ++;
                if (buffer.Length > 0) {
                    items.Add (buffer);
                }
                buffer = c.ToString ();
            } else if (c == ']' || c == ')') {
                parenAndbracketCount --;
                buffer += c;
                if (buffer.Length > 0) {
                    items.Add (buffer);
                    buffer = "";
                }
            } else if (Char.IsWhiteSpace (c) || Char.IsControl (c)) {
                if (parenAndbracketCount == 0) {
                    continue;
                } else {
                    buffer += c;
                }
            } else if (c == '(') {
                parenAndbracketCount ++;
                buffer += c;
            } else {
                buffer += c;
            }
        }
        if (buffer.Length > 0) {
            items.Add (buffer);
        }
        return items.ToArray ();
}
