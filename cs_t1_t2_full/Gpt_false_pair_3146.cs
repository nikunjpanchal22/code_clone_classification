public static void Main (string [] args) {
    List < Demo > all = new List < Demo > ();
    all.Add (new Demo {Name = "a"});
    all.Add (new Demo {Name = "ab"});
    all.Add (new Demo {Name = "abc"});
    all.Add (new Demo {Name = "cba"});
    all.Add (new Demo {Name = "bac"});
    all.Add (new Demo {Name = "ddd"});
    var t = Filter (all, "Name", "a");
    Console.WriteLine (t.Count);
}


public static void Main (string [] args) {
    List < Demo > all = new List < Demo > ();
    all.Add (new Demo {Name = "b"});
    all.Add (new Demo {Name = "ab"});
    all.Add (new Demo {Name = "acb"});
    all.Add (new Demo {Name = "cba"});
    all.Add (new Demo {Name = "bca"});
    all.Add (new Demo {Name = "ddd"});
    var t = Filter (all, "Name", "b");
    Console.WriteLine (t.Count);
}
