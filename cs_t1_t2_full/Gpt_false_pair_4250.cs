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


private static void Main () {
    if (Environment.UserInteractive) {
        startWorkerThread ();
        Console.WriteLine ("======  Type in to end threads  ======");
        Console.ReadLine ();
        stopWorkerThread ();
        Console.WriteLine ("======  Type in to quit  ======");
        Console.ReadLine ();
    } else {
        Run (this);
    }
}
