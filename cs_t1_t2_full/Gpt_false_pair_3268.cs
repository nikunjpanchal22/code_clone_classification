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
        Launch (args);
        Console.WriteLine ("Press any key to stop...");
        Console.ReadKey (true);
        Terminate ();
    } else {
        using (var service = new Service ())
        {
            ServiceBase.Launch (service);
        }}
}
