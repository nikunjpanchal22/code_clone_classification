[TestMethod] public void Test_ThatMyEventIsRaised () {
    List < string > receivedEvents = new List < string > ();
    MyClass myClass = new MyClass ();
    myClass.PropertyChanged += delegate (object sender, PropertyChangedEventArgs e) {
        receivedEvents.Add (e.PropertyName);
    };
    myClass.MyProperty = "testing";
    Assert.AreEqual (2, receivedEvents.Count);
    Assert.AreEqual ("MyProperty", receivedEvents [0]);
    Assert.AreEqual ("MyOtherProperty", receivedEvents [1]);
}


 [TestMethod] public void Test_ThatMyEventIsRaised() 
{
                    List<string> receivedEvents = new List<string> ();
                    MyClass myClass = new MyClass ();
                    myClass.PropertyChanged += OnPropertyChanged;
                    myClass.MyProperty = "testing";
                    Assert.AreEqual(2, receivedEvents.Count);
                    Assert.AreEqual("MyProperty", receivedEvents[0]);
                    Assert.AreEqual("MyOtherProperty", receivedEvents[1]);
                }

                private void OnPropertyChanged(object sender, PropertyChangedEventArgs e)
                {
                if (e.PropertyName == "MyProperty" || e.PropertyName == "MyOtherProperty")   
                    receivedEvents.Add(e.PropertyName);

}


