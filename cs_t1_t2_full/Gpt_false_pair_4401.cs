void initialize () {
    ConcurrentQueue < string > queue = new ConcurrentQueue < string > ();
    foreach (string url in websites) {
        queue.Enqueue (url);
    }
    List < Thread > threads = new List < Thread > ();
    for (int i = 0; i < threadCountFromTheUser; i ++) {
        threads.Add (new Thread (work));
    }
}


void initialize () {
    ConcurrentBag < string > bag = new ConcurrentBag < string > ();
    foreach (string url in websites) {
        bag.Add (url);
    }
    List < Task > tasks = new List < Task > ();
    for (int i = 0; i < threadCountFromTheUser; i ++) {
        tasks.Add (Task.Factory.StartNew (work));
    }
}
