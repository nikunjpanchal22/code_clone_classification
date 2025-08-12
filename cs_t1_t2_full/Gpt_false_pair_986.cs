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
    TextWriter originalOutput = OutputStack.Peek ();
    OutputStreamWriter outputWriter = new OutputStreamWriter (fakeOutput);
    OutputStack.Push (outputWriter);
    base.ExecutePageHierarchy ();
    string content = outputWriter.ToString ();
    OutputStack.Pop ();
    OutputStack.Push (originalOutput);
    originalOutput.Write (content);
}
