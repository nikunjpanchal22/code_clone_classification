static void Main () {
    var dict = new Dictionary < string, int > ();
    dict.Add ("cat", 2);
    dict.Add ("dog", 3);
    dict.Add ("x", 4);
    var dict2 = new Dictionary < string, int > ();
    dict2.Add ("cat", 2);
    dict2.Add ("dog", 3);
    dict2.Add ("x", 4);
    bool equal = false;
    if (dict.Count == dict2.Count) {
        equal = true;
        foreach (var pair in dict) {
            int value;
            if (dict2.TryGetValue (pair.Key, out value)) {
                if (value != pair.Value) {
                    equal = false;
                    break;
                }
            } else {
                equal = false;
                break;
            }
        }
    }
    Console.WriteLine (equal);
}


static void Main () {
    var d = new Dictionary < string, int > ();
    d.Add ("cat", 2);
    d.Add ("dog", 3);
    d.Add ("x", 4);
    var d2 = new Dictionary < string, int > ();
    d2.Add ("cat", 2);
    d2.Add ("dog", 3);
    d2.Add ("x", 4);
    bool e = false;
    if (d.Count == d2.Count) {
        e = true;
        foreach (var p in d) {
            int val;
            if (d2.TryGetValue (p.Key, out val)) {
                if (val != p.Value) {
                    e = false;
                    break;
                }
            } else {
                e = false;
                break;
            }
        }
    }
    Console.WriteLine (e);
}
