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
    Stream fakeOutput = new MemoryStream ();
    TextWriter topOutput = OutputStack.Pop ();
    StreamWriter streamWriter = new StreamWriter (fakeOutput);
    OutputStack.Push (streamWriter);
    base.ExecutePageHierarchy ();
    string content = streamWriter.ToString ();
    OutputStack.Pop ();
    OutputStack.Push (topOutput);
    topOutput.Write (content);
}
