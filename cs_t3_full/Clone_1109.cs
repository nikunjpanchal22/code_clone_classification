public string [] Parse (string input) {
    bool open = false;
    int openIndex = - 1;
    List < string > matches = new List < string > ();
    for (int i = 0; i < input.Length; i ++) {
        if (! open && input [i] == OpenToken) {
            open = true;
            openIndex = i;
        } else if (open && input [i] == CloseToken) {
            open = false;
            string match = input.Substring (openIndex + 1, i - openIndex - 1);
            matches.Add (match);
        } else if (open && input [i] == OpenToken && ThrowOnError)
            throw new Exception ("Open token found while match is open");
        else if (! open && input [i] == CloseToken && ThrowOnError)
            throw new Exception ("Close token found while match is not open");
    }
    return matches.ToArray ();
}


  public string[] Parse (string input) {
        bool open = false;
        int openIndex = -1;
        List<string> matches = new List<string>();
        for (int i = 0; i < input.Length; i++)
        {
            if (!open && input[i] == OpenToken)
            {
                open = true;
                openIndex = i;
            } else if (open && input[i] == CloseToken)
            {
                open = false;
                string match = input.Substring(openIndex, i - openIndex - 1);
                matches.Add(match);
            } else if (open && input [i] == OpenToken && ThrowOnError)
            {
                Console.WriteLine("Open token found while match is open");
            } else if (!open && input[i] == CloseToken && ThrowOnError)
            {
                Console.WriteLine("Close token found while match is not open");
            }
        }         
        return matches.ToArray();
}


