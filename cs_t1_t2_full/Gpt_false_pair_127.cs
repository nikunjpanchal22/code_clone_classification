static void Main (string [] args) {
    authenticator auth = new authenticator ();
    string login = "hello";
    string pass = "12345";
    if (auth.CheckPassword (login, pass))
        Console.Write ("Access granted");
    else
        Console.Write ("Wrong login or password");
}


 static void Main (string [] args) {
    authenticator auth = new authenticator ();
    string login = "hello";
    string pass = "12345";
    bool loggedInCorrectly = auth.CheckPassword (login, pass);
    if (loggedInCorrectly)
        Console.Write ("Access granted");
    else
        Console.Write ("Wrong login or password");
}
