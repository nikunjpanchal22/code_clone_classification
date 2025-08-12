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
    ConsoleKeyInfo KP = Console.ReadKey ();
    if (KP.Key != ConsoleKey.F2) {
        Console.WriteLine ("Please enter your name: ");
        string UserName = KP.KeyChar.ToString () + Console.ReadLine ();
        Console.WriteLine (UserName);
    }
    Console.ReadLine ();
}


