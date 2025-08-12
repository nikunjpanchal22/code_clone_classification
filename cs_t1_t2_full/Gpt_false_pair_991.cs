public override void ExecutePageHierarchy () {
    StringWriter fakeOutput = new StringWriter ();
    TextWriter outputStackTopOutput = OutputStack.Pop ();
    OutputStack.Push (fakeOutput);
    base.ExecutePageHierarchy ();
    string content = fakeOutput.ToString ();
    OutputStack.Pop ();
    OutputStack.Push (outputStackTopOutput);
    outputStackTopOutput.Write (content);
}


  public override void ExecutePageHierarchy () {
    StringWriter fakeOutput = new StringWriter ();
    TextWriter originalOutput = OutputStack.Pop ();
    OutputStack.Push (fakeOutput);
    base.ExecutePageHierarchy ();
    string content = fakeOutput.ToString ();
    OutputStack.Pop ();
    OutputStack.Push (originalOutput);
    originalOutput.Write (content);
}
