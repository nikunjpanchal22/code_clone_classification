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


static IEnumerable < string > GetFiles (string directory) {
    Stack < string > stack = new Stack < string > ();
    stack.Push (directory);
    while (stack.Count > 0) {
        directory = stack.Pop ();
        try {
            foreach (string subDir in Directory.GetDirectories (directory)) {
                stack.Push (subDir);
            }
        }
        catch (Exception ex) {
            Console.Error.WriteLine (ex);
        }
        string [] files = null;
        try {
            files = Directory.GetFiles (directory);
        }
        catch (Exception ex) {
            Console.Error.WriteLine (ex);
        }
        if (files != null) {
            for (int i = files.Length - 1; i >= 0; i --) {
                yield return files [i];
            }
        }
    }
}
