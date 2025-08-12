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
    
    while (true)
    {
        Console.Write("Please enter your login: ");
        string login = Console.ReadLine(); 
        Console.Write("Please enter your password: ");
        string pass = Console.ReadLine(); 
        
        if (auth.CheckPassword(login, pass))
        {
            Console.Write("Access granted");
            break;
        }
        else
        {
            Console.Write("Wrong login or password try again");
        }
    }
}


