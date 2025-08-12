static void Main (string [] args) {
    if (Environment.UserInteractive) {
        Start (args);
        Console.WriteLine ("Press any key to stop...");
        Console.ReadKey (true);
        Stop ();
    } else {
        using (var service = new Service ())
        {
            ServiceBase.Run (service);
        }}
}


 static void Main (string [] args) { 
    if (Environment.UserInteractive) { 
        Start (args); 
        Console.WriteLine ("Hit a key to exit the program..."); 
        while (!Console.KeyAvailable) { 
            Console.ReadKey (true); 
            Stop (); 
        } 
    } 
    else 
    { 
        using (var service = new Service()) 
        { 
            ServiceBase.Run(service); 
        } 
    }    
}
