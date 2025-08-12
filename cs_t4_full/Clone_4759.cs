[Test] public void TestShouldFindProperty () {
    MockClass mockObject = new MockClass ();
    Assert.IsTrue (mockObject.HasProperty ("Id"));
    Assert.IsTrue (mockObject.HasProperty ("Name"));
    Assert.IsTrue (mockObject.HasProperty ("GetOnly"));
    Assert.IsTrue (mockObject.HasProperty ("SetOnly"));
    Assert.IsTrue (mockObject.HasProperty ("Nested"));
    Assert.IsTrue (mockObject.HasProperty ("Nested.NestedId"));
    Assert.IsTrue (mockObject.HasProperty ("Nested.NestedName"));
    Assert.IsTrue (mockObject.HasProperty ("Nested.NestedGetOnly"));
    Assert.IsTrue (mockObject.HasProperty ("Nested.NestedSetOnly"));
}


 [Test] public void TestPropertyExistence() 
{
    MockClass mockObject = new MockClass ();

    Assert.AreEqual (true, mockObject.PropertyExist("Id"));
    Assert.AreEqual (true, mockObject.PropertyExist("Name"));
    Assert.AreEqual (true, mockObject.PropertyExist("GetOnly"));
    Assert.AreEqual (true, mockObject.PropertyExist("SetOnly"));
    Assert.AreEqual (true, mockObject.PropertyExist("Nested"));
    Assert.AreEqual (true, mockObject.PropertyExist("Nested.NestedId"));
    Assert.AreEqual (true, mockObject.PropertyExist("Nested.NestedName"));
    Assert.AreEqual (true, mockObject.PropertyExist("Nested.NestedGetOnly"));
    Assert.AreEqual (true, mockObject.PropertyExist("Nested.NestedSetOnly"));
}


