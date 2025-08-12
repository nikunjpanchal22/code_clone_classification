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
    Console.Out.Write("{0} ", a.Next(100));
    Console.Out.Write("{0} ", a.Next(100));
    Console.Out.WriteLine("{0} ", a.Next(100));
    StateRandom b = new StateRandom(123, state);
    Console.Out.Write("{0} ", b.Next(100));
    Console.Out.Write("{0} ", b.Next(100));
    Console.Out.WriteLine("{0} ", b.Next(100));
}


