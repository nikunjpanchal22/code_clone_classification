static void Main (string [] args) {
    List < string > color1 = new List < string > {"blue", "green", "mother", "black", "gray"};
    List < string > color2 = new List < string > {"mother", "green", "father", "black", "gray"};
    string rd = GetRandom (color1);
    if (color2.Contains (rd)) {
        Console.WriteLine (rd);
    } else {
    }
    Console.Read ();
}


static void Main (string [] args)
{
    List<string> color1 = new List<string> {"blue", "green", "mother", "black", "gray"};
    List<string> color2 = new List<string> {"mother", "green", "father", "black", "gray"};

    Random number = new Random();
    int size = color1.Count;
    int pick = number.Next(size);
    string rd = color1[pick];

    if (color2.Contains(rd))
    {
        Console.WriteLine(rd);
    }
    else
    {
    }

    Console.Read();
}


