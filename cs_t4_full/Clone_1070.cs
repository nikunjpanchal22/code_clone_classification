[TestMethod] public void TestMethod1 () {
    int testVal = 2012;
    TestClass myTest = new TestClass ();
    var expected = new List < int > ();
    expected.Add (2012);
    expected.Add (2016);
    expected.Add (2020);
    expected.Add (2024);
    expected.Add (2028);
    expected.Add (2032);
    expected.Add (2036);
    expected.Add (2040);
    expected.Add (2044);
    expected.Add (2048);
    expected.Add (2052);
    expected.Add (2056);
    expected.Add (2060);
    expected.Add (2064);
    expected.Add (2068);
    expected.Add (2072);
    expected.Add (2076);
    expected.Add (2080);
    expected.Add (2084);
    expected.Add (2088);
    var actual = myTest.Testing (2012);
    CollectionAssert.AreEqual (expected, actual);
}


 [TestMethod] public void TestMethod1() 
{ 
    int testVal = 2012; 
    TestClass myTest = new TestClass(); 
    var expected = new List<int> { 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088 };
    var actual = myTest.Testing(2012); 
    CollectionAssert.AreEqual(expected, actual); 
} 


