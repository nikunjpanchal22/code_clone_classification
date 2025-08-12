[Test] public void test () {
    List < int > test = new List < int > ();
    for (int i = 0; i < 10; i ++) {
        test.Add (MyMath.Random (100));
    }
    Console.WriteLine ("result:");
    foreach (int i in test) {
        Console.WriteLine ();
    }
}


 [Test] public void test() {
    List<int> test = new List<int>();
    for (int i = 0; i < 10; i++) {
        test.Add(MyMath.Random(100));
    }
    Console.Write("result:");
    foreach (int j in test) {
        Console.Write(" " + j);
    }
}
