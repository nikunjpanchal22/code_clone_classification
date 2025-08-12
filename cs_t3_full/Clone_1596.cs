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
    ConcurrentDictionary<string,int> queue = new ConcurrentDictionary<string,int>();
    foreach (string url in websites) {
        queue.TryAdd(url,1);
    }
    List<Thread> threads = new List<Thread>();
    for (int i = 0;i < threadCountFromTheUser; i ++) {
        threads.Add(new Thread (work));
    }
}


