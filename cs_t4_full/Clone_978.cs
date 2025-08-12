private static void Compile () {
    if (_assembly == null) {
        StringBuilder src = new StringBuilder (CodeStart);
        foreach (KeyValuePair < string, string > kvp in _conditionSnippet)
            src.AppendFormat (ConditionTemplate, DynamicConditionPrefix, kvp.Key, kvp.Value);
        foreach (KeyValuePair < string, string > kvp in _methodSnippet)
            src.AppendFormat (MethodTemplate, kvp.Key, kvp.Value);
        src.Append (CodeEnd);
        Trace.TraceError ("SOURCE\r\n{0}", src);
        _assembly = Compile (src.ToString ());
    }
}


 private static void Compile()
{
    if (_assembly == null)
    {
        List<String> sourceLines = new List<String>();
        sourceLines.Add(CodeStart);

        foreach (KeyValuePair < string, string > kvp in _conditionSnippet)
            sourceLines.Add(string.Format(ConditionTemplate, DynamicConditionPrefix, kvp.Key, kvp.Value));
        foreach (KeyValuePair < string, string > kvp in _methodSnippet)
            sourceLines.Add(string.Format(MethodTemplate, kvp.Key, kvp.Value));

        sourceLines.Add(CodeEnd);
        string sourceCode = string.Join(Environment.NewLine, sourceLines);
        
        Trace.TraceError("SOURCE\r\n{0}", sourceCode);
        _assembly = CompileSourceToAssemblyWithLinker(sourceCode);
    }
}


