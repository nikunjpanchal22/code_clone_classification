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
    int c;
    StringBuilder sb = new StringBuilder();
    c = Read();
    if (c == -1)
        return null;
    else
    {
        while (c != ',' && c != -1)
        {
            char character = (char) c;
            sb.Append(character);
            c = Read();
        }
        return sb.ToString();
    }
}


