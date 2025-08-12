static void Main (string [] args) {
    int [] [] test1 = CreateRandomArrays (50, 200000);
    int [] [] test2 = CreateRandomArrays (50, 200000);
    Stopwatch s = new Stopwatch ();
    s.Start ();
    for (int i = 0; i < test1.Length; i ++)
        MyMethod1 (test1 [i], "z");
    s.Stop ();
    Console.WriteLine (s.ElapsedMilliseconds);
    s.Restart ();
    for (int i = 0; i < test2.Length; i ++)
        MyMethod2 (test2 [i], "z");
    s.Stop ();
    Console.WriteLine (s.ElapsedMilliseconds);
}


 static void Main (string [] args) {
    int [] [] test1 = CreateRandomArrays (25, 25000);
    int [] [] test2 = CreateRandomArrays (25, 25000);
    Stopwatch s = new Stopwatch ();
    s.Start ();
    for (int i = 0; i < test1.Length; i ++)
        MyMethod1 (test1 [i], "1");
    s.Stop ();
    Console.WriteLine (s.ElapsedMilliseconds);
    s.Restart ();
    for (int i = 0; i < test2.Length; i ++)
        MyMethod2 (test2 [i], "2");
    s.Stop ();
    Console.WriteLine (s.ElapsedMilliseconds);
}
