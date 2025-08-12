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


 public static void Execute(string[] args)
{
     List<Demo> group = new List<Demo>();
     group.Add(new Demo{Name = "a"});
     group.Add(new Demo{Name = "ab"});
     group.Add(new Demo{Name = "abc"});
     group.Add(new Demo{Name = "cba"});
     group.Add(new Demo{Name = "bac"});
     group.Add(new Demo{Name = "ddd"});
     var t = Filter(group, "Name", "a");
     Console.WriteLine(t.Count);
}
