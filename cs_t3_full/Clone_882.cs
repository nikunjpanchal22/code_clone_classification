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


static void Main(string[] args) 
{
    List<string> color1 = new List<string>{"blue", "green", "mother", "black", "gray"};
    List<string> color2 = new List<string>{"mother", "green", "father", "black", "gray"};

    var random = new Random();
    int index = random.Next(color1.Count);
    if (color2.Contains(color1[index]))
    {
        Console.WriteLine(color1[index]);
    }
    else 
    {
    }

    Console.ReadLine();
}


