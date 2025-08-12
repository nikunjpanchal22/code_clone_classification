private static void Main (string [] args) {
    const int maxPassword = 100000000;
    Console.WriteLine ("Enter number of threads: ");
    var threadsCountString = Console.ReadLine ();
    var threadsCount = int.Parse (threadsCountString);
    var threads = new Thread [threadsCount];
    for (int i = 0; i < threadsCount; i ++) {
        var thread = new Thread (Bruteforce);
        threads [i] = thread;
    }
    time.Start ();
    for (int i = 0; i < threadsCount; i ++) {
        threads [i].Start (new BruteforceParams {StartNumber = i * maxPassword / threadsCount, EndNumber = (i + 1) * maxPassword / threadsCount});
    }
    Console.ReadKey ();
}


  private static void Main(string[] args)
{
    const int maxPassword = 100000000;
    Console.WriteLine("Enter number of threads: ");
    String threadsCountString = Console.ReadLine();
    int threadsCount = int.Parse(threadsCountString);
    Thread[] threads = new Thread[threadsCount];
    for (int i = 0; i < threadsCount; i++)
    {
        threads[i] = new Thread(Bruteforce);
    }
    time.Start();
    for (int i = 0; i < threadsCount; i++)
    {
        threads[i].Start(new BruteforceParams{StartNumber = i * maxPassword / threadsCount, EndNumber = (i + 1) * maxPassword / threadsCount});
    }
    Console.ReadKey();
} 


