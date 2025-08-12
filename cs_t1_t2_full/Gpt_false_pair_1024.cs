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
        int data = Read();
        if (data == -1)
            return null;

        StringBuilder sb = new StringBuilder();
        do
        {
            char charData = (char)data;
            if (charData == ',')
            {
                return sb.ToString();
            }
            else
            {
                sb.Append (charData);
            } 
        } 
        while((data = Read())!=-1);
   
        return sb.ToString();
}
