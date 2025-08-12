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
    for (int i = 0; i < 1000000000; i++) {
        double isMultipleOf16 = (double)i/16.0;
        bool isInteger = isMultipleOf16 % 1 == 0;
        count += isInteger ? 1 : 0;
    }
    sw.Stop ();
    Console.WriteLine (string.Format ("Ellapsed {0}, count {1}", sw.Elapsed, count));
    Console.ReadKey ();
}


