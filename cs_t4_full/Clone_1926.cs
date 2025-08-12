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


 
static void Main () 
{
    var dict = new Dictionary < string, int > ();
    dict.Add ("cat", 2);
    dict.Add ("dog", 3);
    dict.Add ("x", 4);
    var dict2 = new Dictionary < string, int > ();
    dict2.Add ("cat", 2);
    dict2.Add ("dog", 3);
    dict2.Add ("x", 4);
    bool equal = dict.Count == dict2.Count && dict.Keys.OrderBy(k => k).SequenceEqual(dict2.Keys.OrderBy(k => k))
           && dict.Values.OrderBy(v => v).SequenceEqual(dict2.Values.OrderBy(v => v));
    Console.WriteLine (equal);
}


