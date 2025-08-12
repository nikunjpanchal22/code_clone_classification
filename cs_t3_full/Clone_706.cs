static void Main (string [] args) {
    Stopwatch sw = new Stopwatch ();
    sw.Start ();
    int count = 0;
    for (uint i = 0; i < 1000000000; ++ i) {
        var isMultipleOf16 = i % 16 == 0;
        count += isMultipleOf16 ? 1 : 0;
    }
    sw.Stop ();
    Console.WriteLine (string.Format ("Ellapsed {0}, count {1}", sw.Elapsed, count));
    Console.ReadKey ();
}


 static void Main (string [] args) {
   Stopwatch sw = new Stopwatch ();
   sw.Start ();
   int count = 0;
    for (uint i = 0; i < 1000000000; i ++) {
        if(i%16 == 0){
            count ++;
        }
    }
   sw.Stop ();
   Console.WriteLine (string.Format ("Ellapsed {0}, count {1}", sw.Elapsed, count));
   Console.ReadKey ();
} 


