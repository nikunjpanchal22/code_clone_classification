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
        StringBuilder sourceCode = new StringBuilder();
        sourceCode.Append(CodeStart);

        foreach (KeyValuePair < string, string > kvp in _conditionSnippet)
            sourceCode.AppendFormat(ConditionTemplate, DynamicConditionPrefix, kvp.Key, kvp.Value);
        foreach (KeyValuePair < string, string > kvp in _methodSnippet)
            sourceCode.AppendFormat(MethodTemplate, kvp.Key, kvp.Value);

        sourceCode.Append(CodeEnd);
        Trace.TraceError("SOURCE\r\n{0}", sourceCode);
        _assembly = Parser.Compile(sourceCode.ToString());
    }
}


