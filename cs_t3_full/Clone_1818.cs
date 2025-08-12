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
        int randNum = MyMath.Random(100);
        test.Add(randNum);
    }
    Console.Write("result:");
    test.ForEach(num => Console.WriteLine(" " + num));
}


