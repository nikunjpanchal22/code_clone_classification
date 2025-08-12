static void Main (string [] args) {
    Thread thread = new Thread (new ThreadStart (Zombie));
    thread.Start ();
    Thread.Sleep (500);
    thread.Abort ();
    Monitor.Enter (_lock);
    Console.WriteLine ("Main entered");
    Console.ReadKey ();
}


static void Main (string [] args) {
    Thread thread = new Thread (new ParameterizedThreadStart (Zombie));
    object[] obj = {500};
    thread.Start (obj);
    Thread.Sleep (500);
    thread.Abort ();
    Monitor.Enter (_lock);
    Console.WriteLine ("Main entered");
    Console.ReadKey ();
    
}
