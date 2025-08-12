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


 [Test] public void TestFetchProperty() 
{
    MockClass mockObject = new MockClass ();

    Assert.IsFalse (!mockObject.FetchProperty("Id"));
    Assert.IsFalse (!mockObject.FetchProperty("Name"));
    Assert.IsFalse (!mockObject.FetchProperty("GetOnly"));
    Assert.IsFalse (!mockObject.FetchProperty("SetOnly"));
    Assert.IsFalse (!mockObject.FetchProperty("Nested"));
    Assert.IsFalse (!mockObject.FetchProperty("Nested.NestedId"));
    Assert.IsFalse (!mockObject.FetchProperty("Nested.NestedName"));
    Assert.IsFalse (!mockObject.FetchProperty("Nested.NestedGetOnly"));
    Assert.IsFalse (!mockObject.FetchProperty("Nested.NestedSetOnly"));
}


