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
    int[] numList = new int[]{1,2,3,4};
    for (int i = 0; i < numList.Length; i++)
    ListOfFoo.Add (new Foo (numList[i]));
    var threads = new List < Thread > ();
    for (int a = 0; a < ListOfFoo.Count; a++){
        Foo f = ListOfFoo[a];
        Thread thread = new Thread(()=>f.DoSomething());
        threads.Add (thread);
        thread.Start ();
    }
}


