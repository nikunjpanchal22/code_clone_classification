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
        char[] characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                            + "abcdefghijklmnopqrstuvwxyz"
                            + "1234567890".ToCharArray();

        Random r = new Random();
        int strLength = r.Next(1, 10);
        var sb = new StringBuilder(strLength);

        for (int i = 0; i < strLength; i++)
            sb.Append(characterSet[r.Next(0, characterSet.Length)]);

        Console.WriteLine($"Generated random string: {sb.ToString()}");
        Console.ReadLine();
}


