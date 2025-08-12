static void Main (string [] args) {
    string [] ahri = {"Academy", "Challenger", "Dynasty", "Foxfire", "Midnight", "Popstar"};
    string [] leeSin = {"Traditional", "Acolyte", "Dragon Fist", "Musy Thai", "Pool Party", "SKT T1", "Knockout"};
    Console.WriteLine ("Conor's Random League of Legends Skin Selector v0.1");
    Console.WriteLine (" ");
    Console.WriteLine (" ");
    Random rnd = new Random ();
    Console.ForegroundColor = ConsoleColor.Gray;
    Console.WriteLine ("What champion would you like to select a skin for?..    ");
    string champion = Console.ReadLine ();
    Console.Write ("Press the 'enter' key for a random champion..     ");
    string question = Console.ReadLine ();
    if (champion == "ahri") {
        int randomNumber = rnd.Next (ahri.Length - 1);
        Console.WriteLine (ahri [randomNumber]);
    } else {
        int randomNumber = rnd.Next (leeSin.Length - 1);
        Console.WriteLine (leeSin [randomNumber]);
    }
}


  static void Main (string [] args) {
    string [] ahri = {"Order of the Lotus Ahri", "K / DA Ahri", "Foxfire Ahri", "Academy Ahri", "Challenger Ahri", "Midnight Ahri"};
    string [] leeSin = {"Traditional Lee Sin", "Acolyte Lee Sin", "Dragon Fist Lee Sin", "Musy Thai Lee Sin", "Pool Party Lee Sin", "Infernal Lee Sin", "Knockout Lee Sin"};
    Console.WriteLine ("Conor's Random League of Legends Skin Selector v0.1");
    Console.WriteLine (" ");
    Console.WriteLine (" ");
    Random rnd = new Random ();
    Console.ForegroundColor = ConsoleColor.Yellow;
    Console.WriteLine ("What champion would you like to select a skin for?..    ");
    string champion = Console.ReadLine ();
    Console.Write ("Press the 'enter' key for a random champion..     ");
    string question = Console.ReadLine ();
    if (champion == "ahri") {
        int randomNumber = rnd.Next (ahri.Length - 1);
        Console.WriteLine (ahri [randomNumber]);
    } else {
        int randomNumber = rnd.Next (leeSin.Length - 1);
        Console.WriteLine (leeSin [randomNumber]);
    }
}
