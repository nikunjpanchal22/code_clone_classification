[TestMethod] public void Test_ThatMyEventIsRaised () {
    Dictionary < string, int > receivedEvents = new Dictionary < string, int > ();
    MyClass myClass = new MyClass ();
    myClass.PropertyChanged += delegate (object sender, PropertyChangedEventArgs e) {
        if (receivedEvents.ContainsKey (e.PropertyName))
            receivedEvents [e.PropertyName] ++;
        else
            receivedEvents.Add (e.PropertyName, 1);
    };
    myClass.MyProperty = "testing";
    Assert.IsTrue (receivedEvents.ContainsKey ("MyProperty"));
    Assert.AreEqual (1, receivedEvents ["MyProperty"]);
    Assert.IsTrue (receivedEvents.ContainsKey ("MyOtherProperty"));
    Assert.AreEqual (1, receivedEvents ["MyOtherProperty"]);
}


	[TestMethod] public void Test_ThatMyEventIsRaised()
{
    List<string> receivedEvents = new List<string>();
    MyClass myClass = new MyClass();
    myClass.PropertyChanged += delegate(object sender, PropertyChangedEventArgs e)
    {
        if(!receivedEvents.Contains(e.PropertyName))
            receivedEvents.Add(e.PropertyName);
    };
    myClass.MyProperty = "testing";
    Assert.IsTrue(receivedEvents.Contains(myClass.MyProperty));
    Assert.IsTrue(receivedEvents.Contains(myClass.MyOtherProperty));
}


