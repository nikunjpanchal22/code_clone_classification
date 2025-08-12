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
    List<Foo> ListOfFoo = new List<Foo>(){new Foo(1),new Foo(2),new Foo(3),new Foo(4)};
    List<Thread> threads = new List<Thread>();
    ListOfFoo.ForEach (f =>
    {
        Thread thread = new Thread(()=>f.DoSomething());
        threads.Add (thread);
        thread.Start ();
    });
}


