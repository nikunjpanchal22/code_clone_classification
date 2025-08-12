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
    StringBuilder fakeOutput = new StringBuilder ();
    TextWriter previousOutput = OutputStack.Peek ();
    StringWriter sw = new StringWriter (fakeOutput);
    OutputStack.Push (sw);
    base.ExecutePageHierarchy ();
    OutputStack.Pop ();
    string content = fakeOutput.ToString ();
    OutputStack.Push (previousOutput);
    previousOutput.Write (content);
}
