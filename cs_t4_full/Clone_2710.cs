static void Main (string [] args) {
    Thread thread = new Thread (new ThreadStart (Zombie));
    thread.Start ();
    Thread.Sleep (500);
    thread.Abort ();
    Monitor.Enter (_lock);
    Console.WriteLine ("Main entered");
    Console.ReadKey ();
}


private static void LoggedMethod(string message)
{
    lock(_lock)
    {
        Console.WriteLine(message);
    }
}


