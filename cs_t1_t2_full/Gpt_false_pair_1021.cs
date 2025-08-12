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
        int charCode = Read();
        if (charCode == -1) 
            return null;

        StringBuilder sb = new StringBuilder();
        do
        {
            char charRead = (char)charCode;
            if (charRead == ',') 
            {
                return sb.ToString();
            }
            else
            {
                sb.Append(charRead);
            } 
        } 
        while ((charCode = Read()) != -1);

        return sb.ToString();
}
