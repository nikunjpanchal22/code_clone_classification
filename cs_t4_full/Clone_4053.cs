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
    Console.Write("Please type your login here: ");
    string login = Console.ReadLine();
    Console.Write("Please type your password here: ");
    string pass = Console.ReadLine();
    if (auth.CheckPassword(login, pass))
    {
        Console.WriteLine("Access granted");
    }
    else
    {
        Console.WriteLine("Wrong login or password");
    }
}


