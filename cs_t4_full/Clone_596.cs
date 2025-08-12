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


 static void Main(string[] args) 
         { 
            Console.Clear(); 
            Console.ForegroundColor = ConsoleColor.Gray; 
            List<string> skins = new List<string>(); 
            skins.Add("Academy"); 
            skins.Add("Challenger"); 
            skins.Add("Dynasty"); 
            skins.Add("Foxfire"); 
            skins.Add("Midnight"); 
            skins.Add("Popstar"); 
            skins.Add("Traditional"); 
            skins.Add("Acolyte"); 
            skins.Add("Dragon Fist"); 
            skins.Add("Musy Thai"); 
            skins.Add("Pool Party"); 
            skins.Add("SKT T1"); 
            skins.Add("Knockout"); 
            Console.WriteLine("Conor's Random League of Legends Skin Selector v0.1\r\n\r\n"); 
            Console.WriteLine("What champion would you like to select a skin for? \r\nPress enter for a random champion...    "); 

            var champion = Console.ReadLine(); 
            var rnd = new Random();  
            if (champion.Equals(string.Empty)) 
            { 
            string random = skins[rnd.Next(skins.Count)]; 
            Console.Write(string.Format("Champion {0} Selected \r\n", random)); 
            Console.WriteLine(string.Format("Your random skin for {0} is: {1}\r\n", random,skins[rnd.Next(skins.Count)])); 
             } 
            else 
            { 
            champion = champion.Trim().ToLower(); 
            string random = skins[rnd.Next(skins.Count)];  
            Console.Write(string.Format("Champion {0} Selected \r\n", random)); 
            Console.WriteLine(string.Format("Your random skin for {0} is: {1}\r\n", random,skins[rnd.Next(skins.Count)])); 
             } 
         } 
                                                                                             
  static void Main(string[] args) 
        { 
            Console.Clear(); 
            Console.ForegroundColor = ConsoleColor.Gray;
            Dictionary<string, List<string>> skins = new Dictionary<string, List<string>>();
            List<string> ahri = new List<string>();
            ahri.Add("Academy");
            ahri.Add("Challenger");
            ahri.Add("Dynasty");
            ahri.Add("Foxfire");
            ahri.Add("Midnight");
            ahri.Add("Popstar");
            skins.Add("ahri", ahri);
            List<string> leesin = new List<string>();
            leesin.Add("Traditional");
            leesin.Add("Acolyte");
            leesin.Add("Dragon Fist");
            leesin.Add("Musy Thai");
            leesin.Add("Pool Party");
            leesin.Add("SKT T1");
            leesin.Add("Knockout");
            skins.Add("leesin", leesin);
            Console.WriteLine("Conor's Random League of Legends Skin Selector v0.1\r\n\r\n");
            Console.WriteLine("What champion would you like to select a skin for? \r\nPress enter for a random champion...    ");
            var champion = Console.ReadLine();
            var rnd = new Random();
            if (champion.Equals(string.Empty))
            {
                var tmpList = Enumerable.ToList(skins.Keys);
                champion = tmpList[rnd.Next(tmpList.Count)];
            }
            else
            {
                champion = champion.Trim().ToLower();
            }
            Console.Write(string.Format("Champion {0} Selected \r\n", champion));
            if (skins.ContainsKey(champion))
            {
                Console.WriteLine(string.Format("Your random skin for {0} is: {1}\r\n", champion, skins[champion][rnd.Next(skins[champion].Count)]));
            }
            else
            {
                Console.Clear();
                Main(args);
            }
        } 

 static void Main (string [] args) {
    Console.Clear ();
    Console.ForegroundColor = ConsoleColor.Gray;
    Dictionary < string, List < string >> skins = new Dictionary < string, List < string >> ();
    List < string > ahri = new List < string > ();
    ahri.Add ("Academy");
    ahri.Add ("Challenger");
    ahri.Add ("Dynasty");
    ahri.Add ("Foxfire");
    ahri.Add ("Midnight");
    ahri.Add ("Popstar");
    skins.Add ("ahri", ahri);
    List < string > leesin = new List < string > ();
    leesin.Add ("Traditional");
    leesin.Add ("Acolyte");
    leesin.Add ("Dragon Fist");
    leesin.Add ("Musy Thai");
    leesin.Add ("Pool Party");
    leesin.Add ("SKT T1");
    leesin.Add ("Knockout");
    skins.Add ("leesin", leesin);
    Console.WriteLine ("Conor's Random League of Legends Skin Selector v0.1\r\n\r\n");
    Console.WriteLine ("What champion would you like to select a skin for? \r\nPress enter for a random champion...    ");
    var champion = Console.ReadLine ();
    var rnd = new Random ();
    if (champion.Equals (string.Empty)) {
        string [] tmpList = Enumerable.ToArray (skins.Keys);
        champion = tmpList [rnd.Next (tmpList.Length)];
    } else {
        champion = champion.Trim ().ToLower ();
    }
    Console.Write (string.Format ("Champion {0} Selected \r\n", champion));
    if (skins.ContainsKey (champion)) {
        Console.WriteLine (string.Format ("Your random skin for {0} is: {1}\r\n", champion, skins [champion] [rnd.Next (skins [champion].Count)]));
    } else {
        Console.Clear ();
        Main (args);
    }
}


