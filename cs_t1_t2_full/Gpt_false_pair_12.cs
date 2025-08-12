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


#1.
private static void Main () {
    if (Environment.UserInteractive) {
        startWorkerThread ();
        Console.WriteLine ("======  Press Q to stop threads  ======");
        while(Console.ReadLine()!="Q")
        {
            Console.WriteLine("Press Q to stop threads");
        }
        stopWorkerThread ();
        Console.WriteLine ("======  Press ENTER to quit  ======");
        Console.ReadLine ();
    } else {
        Run (this);
    }
}
