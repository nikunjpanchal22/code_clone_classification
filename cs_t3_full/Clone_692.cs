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
    Stopwatch stopWatch = new Stopwatch ();
    stopWatch.Start ();
    long currentTime = 0; 
    while(currentTime< 10000)
    {
       // spin
       currentTime = stopWatch.ElapsedMilliseconds;
    }
    stopWatch.Stop ();
    TimeSpan ts = stopWatch.Elapsed;
    string elapsedTime = String.Format ("{0:00}:{1:00}:{2:00}.{3:00}", ts.Hours, ts.Minutes, ts.Seconds, ts.Milliseconds / 10);
    Console.WriteLine ("RunTime " + elapsedTime);
}


