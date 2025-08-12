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


[Test] public void TestShouldFindProperty_Variant_2 () {
    MockClass mockObject = new MockClass ();
    Assert.IsTrue (mockObject.HasProperty ("Id"));
    Assert.IsTrue (mockObject.HasProperty ("Name"));
    Assert.IsTrue (mockObject.HasProperty ("GetOnly"));
    Assert.IsTrue (mockObject.HasProperty ("SetOnly"));
    Assert.IsTrue (mockObject.HasProperty ("Nested"));
    Assert.IsTrue (mockObject.HasProperty ("Nested.NestedId"));
    Assert.IsTrue (mockObject.HasProperty ("Nested.NestedSetOnly"));
}
