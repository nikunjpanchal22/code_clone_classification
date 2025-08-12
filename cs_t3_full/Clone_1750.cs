public void PrintRandom () {
    Random r = new Random ();
    int strLength = r.Next (1, 10);
    var sb = new StringBuilder ();
    for (int i = 0; i < strLength; i ++) {
        int whichType = r.Next (0, 3);
        switch (whichType) {
            case 0 :
                sb.Append ((char) (97 + r.Next (0, 26)));
                break;
            case 1 :
                sb.Append ((char) (65 + r.Next (0, 26)));
                break;
            case 2 :
                sb.Append ((char) (48 + r.Next (0, 10)));
                break;
        }
    }
    Console.WriteLine (sb.ToString ());
    Console.ReadLine ();
}


 public void PrintRandom()
    {
        Random r = new Random();
        int strLength = r.Next(1, 10);
        string outputString = "";
        for (int i = 0; i < strLength; i++)
        {
            int whichType = r.Next(0, 3);
            switch (whichType)
            {
                case 0:
                    outputString += (char)(97 + r.Next(0, 26));
                    break;
                case 1:
                    outputString += (char)(65 + r.Next(0, 26));
                    break;
                case 2:
                    outputString += (char)(48 + r.Next(0, 10));
                    break;
            }
        }
        Console.WriteLine($"Generated random string: {outputString}");
        Console.ReadLine();
}


