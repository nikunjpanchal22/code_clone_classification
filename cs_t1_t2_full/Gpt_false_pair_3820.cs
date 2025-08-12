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
    var robots = new Dictionary < string, string [] > ();
    robots.Add ("mechs", new string [] {"Bronze", "Silver", "Gold", "Platinum", "Obsidian", "Steel"});
    robots.Add ("droids", new string [] {"C-4", "C-6", "C-12", "C-18", "C-24", "C-30"});
    Console.WriteLine ("Conor's Random Robot Skin Selector v0.1\r\n\r\n");
    Console.WriteLine ("What robot would you like to select a skin for? \r\nPress enter for a random robot...    ");
    var robot = Console.ReadLine ();
    var rnd = new Random ();
    if (robot.Equals (string.Empty)) {
        var tmpList = Enumerable.ToList (robots.Keys);
        robot = tmpList [rnd.Next (tmpList.Count)];
    } else {
        robot = robot.Trim ().ToLower ();
    }
    Console.Write (string.Format ("Robot {0} Selected \r\n", robot));
    if (robots.ContainsKey (robot)) {
        Console.WriteLine (string.Format ("Your random skin for {0} is: {1}\r\n", robot, robots [robot] [rnd.Next (robots [robot].Length)]));
    } else {
        Console.Clear ();
        Main (args);
    }
}
