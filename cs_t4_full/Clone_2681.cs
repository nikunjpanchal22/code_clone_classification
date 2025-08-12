static void Main (string [] args) {
    Console.Clear ();
    Console.ForegroundColor = ConsoleColor.Gray;
    Dictionary < string, string [] > skins = new Dictionary < string, string [] > ();
    skins.Add ("ahri", new string [] {"Academy", "Challenger", "Dynasty", "Foxfire", "Midnight", "Popstar"});
    skins.Add ("leesin", new string [] {"Traditional", "Acolyte", "Dragon Fist", "Musy Thai", "Pool Party", "SKT T1", "Knockout"});
    Console.WriteLine ("Conor's Random League of Legends Skin Selector v0.1\r\n\r\n");
    Console.WriteLine ("What champion would you like to select a skin for? \r\nPress enter for a random champion...    ");
    var champion = Console.ReadLine ();
    var rnd = new Random ();
    if (champion.Equals (string.Empty)) {
        var tmpList = Enumerable.ToList (skins.Keys);
        champion = tmpList [rnd.Next (tmpList.Count)];
    } else {
        champion = champion.Trim ().ToLower ();
    }
    Console.Write (string.Format ("Champion {0} Selected \r\n", champion));
    if (skins.ContainsKey (champion)) {
        Console.WriteLine (string.Format ("Your random skin for {0} is: {1}\r\n", champion, skins [champion] [rnd.Next (skins [champion].Length)]));
    } else {
        Console.Clear ();
        Main (args);
    }
}


public class LoL
{
    private Dictionary<string, string[]> skins = new Dictionary<string, string[]>
    {
        {"ahri", new[] {"Academy", "Challenger", "Dynasty", "Foxfire", "Midnight", "Popstar"}},
        {"leesin", new[] {"Traditional", "Acolyte", "Dragon Fist", "Musy Thai", "Iron Monk", "SKT1", "Knockout"}}
    };
    private readonly Random rnd = new Random();

    public void Start()
    {
        var input = GetChampion();
        Console.WriteLine(SelectSkin(input));
    }

    private string GetChampion()
    {
        Console.WriteLine("Name a champion:");
        return Console.ReadLine()??"";
    }

    private string SelectSkin(string champion)
    {
        string[] outfits;
        if (skins.ContainsKey(champion)) 
        {
            outfits = skins[champion];
        }
        else
        {
            Console.WriteLine("Champion not found:");
            outfits = skins.Values.ElementAt(rnd.Next(skins.Count));
        }
        return outfits[rnd.Next(outfits.Length)];
    }
}


