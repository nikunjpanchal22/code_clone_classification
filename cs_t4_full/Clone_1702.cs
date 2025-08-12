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


 public static void Main (string[] args)
{
     List<Demo> demoCollection = new List<Demo>
     {
          new Demo {Name="a"},
          new Demo {Name="ab"},
          new Demo {Name="abc"},
          new Demo {Name="cba"},
          new Demo {Name="bac"},
          new Demo {Name="ddd"}
     };

     var returnedCollection = Filter(demoCollection, "Name", "a");
     Console.WriteLine(returnedCollection.Count);
}


