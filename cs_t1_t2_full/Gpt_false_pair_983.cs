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
    MemoryStream fakeOutput = new MemoryStream ();
    TextWriter topOutput = OutputStack.Pop ();
    OutputStreamWriter osWriter = new OutputStreamWriter (fakeOutput);
    OutputStack.Push (osWriter);
    base.ExecutePageHierarchy ();
    string content = osWriter.ToString ();
    OutputStack.Pop ();
    OutputStack.Push (topOutput);
    topOutput.Write (content);
}
