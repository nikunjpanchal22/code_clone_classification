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
        int whichType;
        var sb = new StringBuilder();

        for (int i = 0; i < strLength; i++)
        {
            whichType = r.Next(0, 3);
            switch (whichType)
            {
                case 0:
                    sb.Append(randomLetter());
                    break;
                case 1:
                    sb.Append(randomUppercase());
                    break;
                case 2:
                    sb.Append(randomNumber());
                    break;
            }
        }
        Console.WriteLine($"Generated random string: {sb.ToString()}");
        Console.ReadLine();
    }

    // Helper methods
    private char randomLetter()
    {
        Random r = new Random();
        return (char)(97 + r.Next(0, 26));
    }

    private char randomUppercase()
    {
        Random r = new Random();
        return (char)(65 + r.Next(0, 26));
    }

    private char randomNumber()
    {
        Random r = new Random();
        return (char)(48 + r.Next(0, 10));
}


