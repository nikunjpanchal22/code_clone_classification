static void Main (string [] args) {
    Stopwatch sw = new Stopwatch ();
    const int NUM_ITEMS = 10000;
    const int NUM_LOOPS2 = 1000000000;
    List < int > lst = new List < int > (NUM_ITEMS);
    IList < int > ilst = lst;
    for (int i = 0; i < NUM_ITEMS; i ++) {
        lst.Add (i);
    }
    int count = 0;
    sw.Reset ();
    sw.Start ();
    for (int i = 0; i < NUM_LOOPS2; i ++) {
        count = lst.Count;
    }
    sw.Stop ();
    Console.Out.WriteLine ("Took " + (sw.ElapsedMilliseconds) + "ms - 1.");
    sw.Reset ();
    sw.Start ();
    for (int i = 0; i < NUM_LOOPS2; i ++) {
        count = ilst.Count;
    }
    sw.Stop ();
    Console.Out.WriteLine ("Took " + (sw.ElapsedMilliseconds) + "ms - 2.");
}




static void Main (string [] args) {
    Stopwatch timekeeper = new Stopwatch ();
    IList < int > numbers = new int [10000];
    IEnumerable < int > enumerable = numbers;
    numbers.Add(0);
    for (int counter = 1; counter < 10000; counter ++) {
        numbers.Add(counter);
    }
    timekeeper.Reset();
    timekeeper.Start();
    for(int counter = 0; counter < 1000000000; counter++){
        numbers.Count();
    }
    timekeeper.Stop ();
    Console.Write(" Took " + (timekeeper.Elapsed.TotalMilliseconds) + "ms - 1.");

    timekeeper.Reset ();
    timekeeper.Start ();
    for (int counter = 0; counter < 1000000000; counter ++) {
        enumerable.Count();
    }
    timekeeper.Stop ();
    Console.Write(" Took " + (timekeeper.Elapsed.TotalMilliseconds) + "ms - 2.");
}


