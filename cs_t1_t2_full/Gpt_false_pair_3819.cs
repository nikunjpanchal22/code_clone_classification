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


static void Main (string [] args) {
    Console.Clear ();
    Console.ForegroundColor = ConsoleColor.Gray;
    var heroes = new Dictionary < string, string [] > ();
    heroes.Add ("dvorak", new string [] {"Fire", "Earth", "Air", "Water", "Nature", "Light"});
    heroes.Add ("duskwood", new string [] {"Forest", "Cave", "Dark", "Fog", "Night", "Sky"});
    Console.WriteLine ("Conor's Random Heroes Skin Selector v0.1\r\n\r\n");
    Console.WriteLine ("What hero would you like to select a skin for? \r\nPress enter for a random hero...    ");
    var hero = Console.ReadLine ();
    var rnd = new Random ();
    if (hero.Equals (string.Empty)) {
        var tmpList = Enumerable.ToList (heroes.Keys);
        hero = tmpList [rnd.Next (tmpList.Count)];
    } else {
        hero = hero.Trim ().ToLower ();
    }
    Console.Write (string.Format ("Hero {0} Selected \r\n", hero));
    if (heroes.ContainsKey (hero)) {
        Console.WriteLine (string.Format ("Your random skin for {0} is: {1}\r\n", hero, heroes [hero] [rnd.Next (heroes [hero].Length)]));
    } else {
        Console.Clear ();
        Main (args);
    }
}
