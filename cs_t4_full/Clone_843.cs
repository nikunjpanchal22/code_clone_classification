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
    char ch = Console.ReadKey ().KeyChar;
    if (ch != 'F') {
        Console.WriteLine ("Please enter your name: ");
        string UserName = ch + Console.ReadLine ();
        Console.WriteLine (UserName);
    }
    Console.ReadLine ();
}


