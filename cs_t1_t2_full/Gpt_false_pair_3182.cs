static void Main (string [] args) {
    demo obj = new demo ();
    int n = 5;
    string uname, pass;
    Console.ForegroundColor = ConsoleColor.Green;
    label1 : Console.WriteLine ("\n");
    Console.WriteLine ("Enter username");
    uname = Console.ReadLine ();
    Console.WriteLine ("Enter Password");
    pass = Console.ReadLine ();
    obj.setName (uname);
    obj.setPass (pass);
    if (obj.getName () == "niit" && obj.getPass () == "1234") {
        Console.WriteLine ("welcome");
    } else {
        if (n < 1) {
            Console.Clear ();
            Console.WriteLine ("ScreenLock");
        } else {
            Console.WriteLine ("\n Invalid");
            Console.WriteLine ("\n To try again enter y");
            string yes = Console.ReadLine ();
            Console.WriteLine ("\n");
            if (yes == "y") {
                while (n >= 1) {
                    Console.Write (n + " Tries left");
                    n = -- n;
                    goto label1;
                }
            }
        }
    }
    Console.ReadKey ();
}


static void Main(string[] args) 
{
    demo obj = new demo();
    int n = 5;
    string uname, pass;
    Console.ForegroundColor = ConsoleColor.Green;
 label1: Console.WriteLine("\n");
    Console.WriteLine("Enter username");
    uname = Console.ReadLine();
    Console.WriteLine("Enter Password");
    pass = Console.ReadLine();
    obj.setName(uname);
    obj.setPass(pass);
    if (obj.getName() == "niit" && obj.getPass() == "1234") 
    {
        Console.WriteLine("welcome");
    }
    else
    {
        if (n < 1) 
        {
            Console.Clear();
            Console.WriteLine("ScreenLock");
        }
        else 
        {
            Console.WriteLine("\n Invalid");
            Console.WriteLine("\n To try again enter y");
            string yes = Console.ReadLine();
            Console.WriteLine("\n");
            if (yes == "y") 
            {
                Console.Write(n + " Tries left");
                n = --n;
                goto label1;
            }
        }
    }
    Console.ReadKey();
}
