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


public override string ReadLine()
{
    int c ;
    c = Read();
    if(c == -1)
        return null;
    else
    {
        StringBuilder sb = new StringBuilder();
        while(c != ',' && c != -1)
        {
            sb.Append((char)c);
            c = Read();
        }

        return sb.ToString();
    }
}


