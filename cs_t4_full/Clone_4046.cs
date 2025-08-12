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
    Console.Write("Please enter your login: ");
    string login = Console.ReadLine();
    string pass;
    Console.Write("Please enter your password: ");
    bool accessGranted = false;
    do
    {
        pass = Console.ReadLine();
        accessGranted = auth.CheckPassword(login, pass);
        if (accessGranted == true)
            Console.Write("Access granted");
        else
            Console.Write("Wrong login or password, try again");
    } while (!accessGranted);
}


