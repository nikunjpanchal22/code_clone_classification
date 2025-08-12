static void Main (string [] args) {
    authenticator auth = new authenticator ();
    string login = "hello";
    string pass = "12345";
    if (auth.CheckPassword (login, pass))
        Console.Write ("Access granted");
    else
        Console.Write ("Wrong login or password");
}


 
static void Main (string[] args) 
{
    authenticator auth = new authenticator();
    string login, pass;

    Console.Write("Please type your login:");
    login = Console.ReadLine();
    Console.Write("Please type your password:");
    pass = Console.ReadLine();
    
    if (auth.CheckPassword(login, pass))
    {
        Console.WriteLine("Access granted");
    }
    else 
    {
        Console.WriteLine("Invalid login or password");
    }
}


