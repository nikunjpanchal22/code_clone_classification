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



#5.
private static void Main () {
    if (Environment.UserInteractive) {
        startWorkerThread ();
        Console.WriteLine ("======  Type in EXIT to stop threads  ======");
        while(Console.ReadLine() != "EXIT")
        {
            Console.WriteLine("Type in EXIT to stop threads");
        }
        stopWorkerThread ();
        Console.WriteLine ("======  Press ENTER to quit  ======");
        Console.ReadLine ();
    } else {
        Run (this);
    }
}
