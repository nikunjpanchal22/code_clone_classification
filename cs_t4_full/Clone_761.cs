static void Main (string [] args) {
    var ListOfFoo = new List < Foo > ();
    ListOfFoo.Add (new Foo (1));
    ListOfFoo.Add (new Foo (2));
    ListOfFoo.Add (new Foo (3));
    ListOfFoo.Add (new Foo (4));
    var threads = new List < Thread > ();
    foreach (Foo f in ListOfFoo) {
        Thread thread = new Thread(()=>f.DoSomething());
        threads.Add (thread);
        thread.Start ();
    }
}


 static void Main (string [] args) {
    List<Foo> ListOfFoo = new List<Foo>();
    int[] numList = new int[]{1,2,3,4};
    numList.ToList().ForEach(num => ListOfFoo.Add(new Foo(num)));
    List<Thread> threads = new List<Thread>();
    ListOfFoo.ForEach (f =>
    {
        Thread thread = new Thread(()=>f.DoSomething());
        threads.Add (thread);
        thread.Start ();
    });
}


