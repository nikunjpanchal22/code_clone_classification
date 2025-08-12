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


  void Main()
{
    StateRandom a = new StateRandom(123);
    a.Next(100);
    a.Next(100);
    a.Next(100);
    var state = a.NumberOfInvokes;
    System.Console.WriteLine(a.Next(100));
    System.Console.WriteLine(a.Next(100));
    System.Console.WriteLine(a.Next(100));
    StateRandom b = new StateRandom(123, state);
    System.Console.WriteLine(b.Next(100));
    System.Console.WriteLine(b.Next(100));
    System.Console.WriteLine(b.Next(100));
}


