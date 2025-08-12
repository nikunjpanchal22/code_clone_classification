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



 [Test] public void TestShouldCheckAllImportantProperties() {
    MockClass mockObject = new MockClass ();
    Assert.IsTrue (mockObject.ValidateProperty ("Id"));
    Assert.IsTrue (mockObject.ValidateProperty ("Name"));
    Assert.IsTrue (mockObject.ValidateProperty ("GetOnly"));
    Assert.IsTrue (mockObject.ValidateProperty ("SetOnly"));
    Assert.IsTrue (mockObject.ValidateProperty ("Nested"));
    Assert.IsTrue (mockObject.ValidateProperty ("Nested.NestedId"));
    Assert.IsTrue (mockObject.ValidateProperty ("Nested.NestedName"));
    Assert.IsTrue (mockObject.ValidateProperty ("Nested.NestedGetOnly"));
    Assert.IsTrue (mockObject.ValidateProperty ("Nested.NestedSetOnly"));
}
