public override string ReadLine () {
    int c;
    c = Read ();
    if (c == - 1) {
        return null;
    }
    StringBuilder sb = new StringBuilder ();
    do
        {
            char ch = (char) c;
            if (ch == ',') {
                return sb.ToString ();
            } else {
                sb.Append (ch);
            }
        } while ((c = Read ()) != - 1);
    return sb.ToString ();
}


 public override string ReadLine() {
        int asciiValue = Read();
        if (asciiValue == -1)
            return null;

        StringBuilder sb = new StringBuilder();

        do
        {
            char myChar = (char)asciiValue;
            if (myChar == ',')
            {
                return sb.ToString();
            }
            else
            {
                sb.Append(myChar);
            }
        }
        while ((asciiValue = Read()) != -1);

        return sb.ToString();
}
