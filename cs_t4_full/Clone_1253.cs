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
    Console.Write("Enter the number of threads: ");
    int threadsCount = int.Parse(Console.ReadLine());
    Thread[] threads = new Thread[threadsCount];
    time.Start();
    for (int i = 0; i < threadsCount; i++)
    {
        int start = i * maxPassword / threadsCount;
        int end = (i + 1) * maxPassword / threadsCount;
        threads[i] = new Thread(delegate () 
        {
            Bruteforce(start, end);
        });
    }
    foreach (Thread t in threads)
        t.Start();
    Console.ReadKey();
}


