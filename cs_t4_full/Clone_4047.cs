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
    string login = null;
    string pass = null;
    do
    {
        Console.Write("Enter login: ");
        login = Console.ReadLine();
        Console.Write("Enter password: ");
        pass = Console.ReadLine();
        if (auth.CheckPassword(login, pass))
            Console.Write("Access granted");
        else
            Console.Write("Wrong login or password, try again");
    }
    while (!auth.CheckPassword(login, pass));
}


