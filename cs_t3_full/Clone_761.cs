public static void Main (string [] args) {
    var KP = Console.ReadKey ();
    if (KP.Key == ConsoleKey.F2) {
        return;
    }
    string UserName = KP.KeyChar + Console.ReadLine ();
    Console.WriteLine (UserName);
    Console.ReadLine ();
}


 public static void Main (string [] args) {
    var KP = Console.ReadKey ();
    if (KP.Key != ConsoleKey.F2) {
        string UserName = KP.KeyChar + Console.ReadLine ();
        Console.WriteLine (String.Format("Your name is {0}",UserName));
    }
    Console.ReadLine ();
}


