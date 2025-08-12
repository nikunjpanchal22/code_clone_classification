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
    Stopwatch sw = new Stopwatch ();
    const int NUM_ITEMS = 10000;
    const int NUM_LOOPS3 = 1000000000;
    List < int > list = new List < int > (NUM_ITEMS);
    IList < int > interList = list;
    for (int i = 0; i < NUM_ITEMS; i ++) {
        list.Add (i);
    }
    int count = 0;
    sw.Reset ();
    sw.Start ();
    for (int i = 0; i < NUM_LOOPS3; i ++) {
        count = list.Count;
    }
    sw.Stop ();
    Console.Out.WriteLine ("Took " + (sw.ElapsedMilliseconds) + "ms - 3.");
    sw.Reset ();
    sw.Start ();
    for (int i = 0; i < NUM_LOOPS3; i ++) {
        count = interList.Count;
    }
    sw.Stop ();
    Console.Out.WriteLine ("Took " + (sw.ElapsedMilliseconds) + "ms - 4.");
}
