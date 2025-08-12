void Main () {
    var a = new StateRandom (123);
    a.Next (100);
    a.Next (100);
    a.Next (100);
    var state = a.NumberOfInvokes;
    Console.WriteLine (a.Next (100));
    Console.WriteLine (a.Next (100));
    Console.WriteLine (a.Next (100));
    var b = new StateRandom (123, state);
    Console.WriteLine (b.Next (100));
    Console.WriteLine (b.Next (100));
    Console.WriteLine (b.Next (100));
}


void Main () {
    var a = new StateRandom (125);
    a.Next (99);
    a.Next (99);
    a.Next (99);
    var state = a.NumberOfInvokes;
    Console.WriteLine (a.Next (99));
    Console.WriteLine (a.Next (99));
    Console.WriteLine (a.Next (99));
    var b = new StateRandom (125, state);
    Console.WriteLine (b.Next (99));
    Console.WriteLine (b.Next (99));
    Console.WriteLine (b.Next (99));
}
