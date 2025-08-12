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
        Console.WriteLine ("Please press a key to close this application..."); 
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
