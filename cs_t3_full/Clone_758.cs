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
    char ch = Console.ReadLine ()[0];
    if (ch == 'F2') {
        return;
    }
    string UserName = ch + Console.ReadLine ();
    Console.WriteLine (UserName);
    Console.ReadLine ();
}


