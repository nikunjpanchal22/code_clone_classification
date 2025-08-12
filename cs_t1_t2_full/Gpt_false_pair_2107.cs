[TestMethod ()] public void SortTest () {
    TupleList < int, string > list = new TupleList < int, string > ();
    list.Add (1, "cat");
    list.Add (1, "car");
    list.Add (2, "dog");
    list.Add (2, "door");
    list.Add (3, "elephant");
    list.Add (1, "coconut");
    list.Add (1, "cab");
    list.Sort ();
    foreach (Tuple < int, string > tuple in list) {
        Console.WriteLine (string.Format ("{0}:{1}", tuple.Item1, tuple.Item2));
    }
    int expected_first = 1;
    int expected_last = 3;
    int first = list.First ().Item1;
    int last = list.Last ().Item1;
    Assert.AreEqual (expected_first, first);
    Assert.AreEqual (expected_last, last);
}


 [TestMethod ()] public void SortTest ()
        { 
            TupleList<int, string> list = new TupleList<int, string>();
            list.Add(1, "cat");
            list.Add(1, "car");
            list.Add(2, "dog");
            list.Add(2, "door");
            list.Add(3, "elephant");
            list.Add(1, "coconut");
            list.Add(1, "cab");  

            Array.Sort(list.ToArray(), (a, b) => a.Item1.CompareTo(b.Item1));

            foreach(Tuple<int, string> tuple in list) 
            { 
                Console.WriteLine(string.Format("{0}:{1}", tuple.Item1, tuple.Item2)); 
            } 
            int expected_first = 1; 
            int expected_last = 3; 
            int first = list.First().Item1; 
            int last = list.Last().Item1; 
            Assert.AreEqual(expected_first, first); 
            Assert.AreEqual(expected_last, last); 
}
