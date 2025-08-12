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
    ConcurrentQueue<string> queue = new ConcurrentQueue<string>();
    Parallel.ForEach (websites, url => {
        queue.Enqueue(url);
    });
    Thread[] threads = new Thread[threadCountFromTheUser];
    for (int i = 0;i < threadCountFromTheUser; i ++) {
        threads[i] = new Thread (work);
    }  
}


