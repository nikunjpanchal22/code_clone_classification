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



  public static List<Demo> Main(string[] args)
{
     List<Demo> all = new List<Demo>();
     all.Add(new Demo {Name = "a"});
     all.Add(new Demo {Name = "ab"});
     all.Add(new Demo {Name = "abc"});
     all.Add(new Demo {Name = "cba"});
     all.Add(new Demo {Name = "bac"});
     all.Add(new Demo {Name = "ddd"});
     var t = Filter(all, "Name", "a");

     Console.WriteLine(t.Count.ToString());
     return t;
}


