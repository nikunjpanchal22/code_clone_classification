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


 public override string ReadLine () {
        int d = Read();
        if (d == -1) 
            return null;

        StringBuilder sb = new StringBuilder();
        do
        {
            char c = (char)d;
            if (c == ',') 
            {
                return sb.ToString();
            }
            else
            {
                sb.Append(c);
            } 
        } while ((d = Read()) != -1);

        return sb.ToString();
}
