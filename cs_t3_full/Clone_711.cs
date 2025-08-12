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
    int[] numList = {1, 2, 3, 4};
    foreach (int n in numList){
        ListOfFoo.Add (new Foo (n));
    }
    var threads = new List < Thread > ();
    foreach (Foo f in ListOfFoo) {
        Thread thread = new Thread(()=>f.DoSomething());
        threads.Add (thread);
        thread.Start ();
    }
}


