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


 [Test] public void TestCheckPropertiesInMockObject() 
{
    MockClass mockObject = new MockClass ();

    Assert.AreSame (true, mockObject.DiscoverProperty("Id"));
    Assert.AreSame (true, mockObject.DiscoverProperty("Name"));
    Assert.AreSame (true, mockObject.DiscoverProperty("GetOnly"));
    Assert.AreSame (true, mockObject.DiscoverProperty("SetOnly"));
    Assert.AreSame (true, mockObject.DiscoverProperty("Nested"));
    Assert.AreSame (true, mockObject.DiscoverProperty("Nested.NestedId"));
    Assert.AreSame (true, mockObject.DiscoverProperty("Nested.NestedName"));
    Assert.AreSame (true, mockObject.DiscoverProperty("Nested.NestedGetOnly"));
    Assert.AreSame (true, mockObject.DiscoverProperty("Nested.NestedSetOnly"));
} 


