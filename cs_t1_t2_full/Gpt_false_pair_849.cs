static void Main (string [] args) {
    Thread thread = new Thread (new ThreadStart (Zombie));
    thread.Start ();
    Thread.Sleep (500);
    thread.Abort ();
    Monitor.Enter (_lock);
    Console.WriteLine ("Main entered");
    Console.ReadKey ();
}


  static void Main (string [] args) 
{ 
    Thread thread = new Thread (new ThreadStart (Zombie)); 
    thread.Start (); 
    Thread.Sleep (500); 
    thread.DisableComObjectEagerCleanup (); 
    Monitor.Enter (_lock); 
    Console.WriteLine ("Main entered"); 
    Console.ReadKey (); 
} 
