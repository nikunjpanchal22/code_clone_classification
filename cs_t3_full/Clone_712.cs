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
    var ListOfFoo = new List < Foo > ();
    int maxNumber = 4;
    for (int i = 1; i <= maxNumber;i++){
        ListOfFoo.Add (new Foo (i));
    }
    var threads = new List < Thread > ();
    foreach (Foo f in ListOfFoo) {
        Thread thread = new Thread(()=>f.DoSomething());
        threads.Add (thread);
        thread.Start ();
    }
}


