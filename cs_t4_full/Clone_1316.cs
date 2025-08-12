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
    bool myPropertyRaised = false;
    bool myOtherPropertyRaised = false;
    MyClass myClass = new MyClass();
    myClass.PropertyChanged += delegate(object sender, PropertyChangedEventArgs e)
    {
        if (e.PropertyName == "MyProperty")
            myPropertyRaised = true;
        else if (e.PropertyName == "MyOtherProperty")
            myOtherPropertyRaised = true;
    };
    myClass.MyProperty = "testing";
    Assert.IsTrue(myPropertyRaised);
    Assert.IsTrue(myOtherPropertyRaised);
}


