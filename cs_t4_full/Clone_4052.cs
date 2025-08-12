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
    authenticator auth = new authenticator ();
    Console.Write("Please enter login: ");
    string login = Console.ReadLine();
    Console.Write("Please enter password: ");
    string pass = Console.ReadLine();

    bool correctLogin = auth.CheckPassword(login, pass);

    if (correctLogin)
    {
        Console.Write("Access granted");
    }
    else
    {
        Console.Write("Wrong login or password");
    }
}


