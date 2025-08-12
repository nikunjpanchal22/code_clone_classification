static IEnumerable < string > GetFiles (string path) {
    Queue < string > queue = new Queue < string > ();
    queue.Enqueue (path);
    while (queue.Count > 0) {
        path = queue.Dequeue ();
        try {
            foreach (string subDir in Directory.GetDirectories (path)) {
                queue.Enqueue (subDir);
            }
        }
        catch (Exception ex) {
            Console.Error.WriteLine (ex);
        }
        string [] files = null;
        try {
            files = Directory.GetFiles (path);
        }
        catch (Exception ex) {
            Console.Error.WriteLine (ex);
        }
        if (files != null) {
            for (int i = 0; i < files.Length; i ++) {
                yield return files [i];
            }
        }
    }
}


static IEnumerable < string > GetFiles (string dir) {
    List < string > list = new List < string > ();
    list.Add (dir);
    for (int i = 0; i < list.Count; i ++) {
        dir = list [i];
        try {
            foreach (string subDir in Directory.GetDirectories (dir)) {
                list.Add (subDir);
            }
        }
        catch (Exception ex) {
            Console.Error.WriteLine (ex);
        }
        string [] files = null;
        try {
            files = Directory.GetFiles (dir);
        }
        catch (Exception ex) {
            Console.Error.WriteLine (ex);
        }
        if (files != null) {
            for (int j = 0; j < files.Length; j++) {
                yield return files [j];
            }
        }
    }
}
