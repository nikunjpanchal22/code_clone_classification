private static void Main () {
    if (Environment.UserInteractive) {
        startWorkerThread ();
        Console.WriteLine ("======  Press ENTER to stop threads  ======");
        Console.ReadLine ();
        stopWorkerThread ();
        Console.WriteLine ("======  Press ENTER to quit  ======");
        Console.ReadLine ();
    } else {
        Run (this);
    }
}



#4.
private static void Main () {
    if (Environment.UserInteractive) {
        startWorkerThread ();
        Console.WriteLine ("======  Press the 'a' key to stop threads  ======");
        while(Console.ReadKey().keychar != 'a')
        {
            Console.WriteLine("Press the 'a' key to stop threads");
        }
        stopWorkerThread ();
        Console.WriteLine ("======  Press ENTER to quit  ======");
        Console.ReadLine ();
    } else {
        Run (this);
    }
}
