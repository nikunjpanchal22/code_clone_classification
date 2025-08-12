public static void Main () {
    string baseIP = "192.168.1.";
    Console.WriteLine ("Pinging 255 destinations of D-class in {0}*", baseIP);
    CreatePingers (255);
    PingOptions po = new PingOptions (ttl, true);
    System.Text.ASCIIEncoding enc = new System.Text.ASCIIEncoding ();
    byte [] data = enc.GetBytes ("abababababababababababababababab");
    SpinWait wait = new SpinWait ();
    int cnt = 1;
    Stopwatch watch = Stopwatch.StartNew ();
    foreach (Ping p in pingers) {
        lock (@lock)
        {
            instances += 1;
        } p.SendAsync (string.Concat (baseIP, cnt.ToString ()), timeOut, data, po);
        cnt += 1;
    }
    while (instances > 0) {
        wait.SpinOnce ();
    }
    watch.Stop ();
    DestroyPingers ();
    Console.WriteLine ("Finished in {0}. Found {1} active IP-addresses.", watch.Elapsed.ToString (), result);
    Console.ReadKey ();
}


 public static void Main () {
    string baseIP = "192.168.1.";
    Console.WriteLine ("Pinging 255 destinations of D-class in {0}*", baseIP);
    CreatePingers (255);
    PingOptions po = new PingOptions (ttl, true);
    System.Text.ASCIIEncoding enc = new System.Text.ASCIIEncoding ();
    byte [] data = enc.GetBytes ("abababababababababababababababab");
    Interlocked.CompareExchange(ref instances, 0, 0); 
    int cnt = 1;
    Stopwatch watch = Stopwatch.StartNew ();
    foreach (Ping p in pingers) {
        lock (@lock)
        {
            instances += 1;
        } p.SendAsync (string.Concat (baseIP, cnt.ToString ()), timeOut, data, po);
        cnt += 1;
    }
    while (instances > 0) {
        Thread.Yield ();
    }
    watch.Stop ();
    DestroyPingers ();
    Console.WriteLine ("Finished in {0}. Found {1} active IP-addresses.", watch.Elapsed.ToString (), result);
    Console.ReadKey ();
}
