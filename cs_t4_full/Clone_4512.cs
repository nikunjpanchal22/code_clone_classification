public static void Main (string [] args) {
    var KP = Console.ReadKey ();
    if (KP.Key == ConsoleKey.F2) {
        return;
    }
    string UserName = KP.KeyChar + Console.ReadLine ();
    Console.WriteLine (UserName);
    Console.ReadLine ();
}


 public static void Main(String[]args){
    String UserName;
    ConsoleKeyInfo userInput;
    userInput = Console.ReadKey();
    if (userInput.Key == ConsoleKey.F2){
        return;
    } 
    else{
        UserName = userInput.KeyChar + Console.ReadLine();
    } 
    Console.WriteLine(UserName);
    Console.ReadLine();
}


