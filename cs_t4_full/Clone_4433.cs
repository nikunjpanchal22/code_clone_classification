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


public override string ReadLine () 
{
    StringBuilder line = new StringBuilder();

    int c = Read();

    if(c == -1)
        return null;
    else
    {
        while(c != -1 && c != ',')
        {
            line.Append((char)c);
            c = Read();
        }

        return line.ToString();
    }
}


