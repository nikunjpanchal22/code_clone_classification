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
    int ch = Console.ReadKey ().Key;
    if (ch != 70) {
        string UserName = Convert.ToChar(ch) + Console.ReadLine ();
        Console.WriteLine (UserName);
    }
    Console.ReadLine ();
}


