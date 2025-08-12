static void Main (string [] args) {
    Stopwatch stopWatch = new Stopwatch ();
    stopWatch.Start ();
    Thread.Sleep (10000);
    stopWatch.Stop ();
    TimeSpan ts = stopWatch.Elapsed;
    string elapsedTime = String.Format ("{0:00}:{1:00}:{2:00}.{3:00}", ts.Hours, ts.Minutes, ts.Seconds, ts.Milliseconds / 10);
    Console.WriteLine ("RunTime " + elapsedTime);
}


 static void Main (string [] args) {
    int durationMs = 10000; 
    Stopwatch stopWatch = new Stopwatch ();
    stopWatch.Start ();
    for (ulong i=0; i < durationMs; i++)
    {
    // spin
    }
    stopWatch.Stop ();
    TimeSpan ts = stopWatch.Elapsed;
    string elapsedTime = String.Format ("{0:00}:{1:00}:{2:00}.{3:00}", ts.Hours, ts.Minutes, ts.Seconds, ts.Milliseconds / 10);
    Console.WriteLine ("RunTime " + elapsedTime);
}
