public static void Main (string [] args) {
    var KP = Console.ReadKey ();
    if (KP.Key == ConsoleKey.F2) {
        return;
    }
    string UserName = KP.KeyChar + Console.ReadLine ();
    Console.WriteLine (UserName);
    Console.ReadLine ();
}


 public static void Main( string[] args ) {
    Console.Write( "Press F2 to return or press any other key to continue: " );
    if ( Console.ReadKey().Key == ConsoleKey.F2 ) {
        return;
    }
    Console.WriteLine( "\nPlease enter your name: " );
    string userName = Console.ReadKey().KeyChar + Console.ReadLine();
    Console.WriteLine( "\nYour name is "  + userName );
    Console.ReadLine();
}


