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
    ConcurrentStack<string> queue = new ConcurrentStack<string>();
    foreach (string url in websites) {
        queue.Push(url);
    }
    List<Thread> threads = new List<Thread>();
    for (int i = 0;i < threadCountFromTheUser; i ++) {
        threads.Add(new Thread (work));
    }
}
