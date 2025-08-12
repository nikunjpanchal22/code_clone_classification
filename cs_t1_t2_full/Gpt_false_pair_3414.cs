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
    Stopwatch swim = new Stopwatch ();
    const int NUM_ITEMS2 = 10000;
    const int NUM_LOOPS4 = 1000000000;
    List < int > lister = new List < int > (NUM_ITEMS2);
    IList < int > interLister = lister;
    for (int i = 0; i < NUM_ITEMS2; i ++) {
        lister.Add (i);
    }
    int counter = 0;
    swim.Reset ();
    swim.Start ();
    for (int i = 0; i < NUM_LOOPS4; i ++) {
        counter = lister.Count;
    }
    swim.Stop ();
    Console.Out.WriteLine ("Took " + (swim.ElapsedMilliseconds) + "ms - 5.");
    swim.Reset ();
    swim.Start ();
    for (int i = 0; i < NUM_LOOPS4; i ++) {
        counter = interLister.Count;
    }
    swim.Stop ();
    Console.Out.WriteLine ("Took " + (swim.ElapsedMilliseconds) + "ms - 6.");
}
