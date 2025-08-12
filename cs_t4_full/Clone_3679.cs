public static string SummarizeMethodCall (MethodBase method, params object [] values) {
    var output = new StringBuilder (method.Name + " invoked: ");
    ParameterInfo [] parameters = method.GetParameters ();
    for (int i = 0; i < parameters.Length; i ++) {
        output.AppendFormat ("{0} = {1}", parameters [i].Name, i >= values.Length ? "<empty>" : values [i]);
        if (i < parameters.Length - 1)
            output.Append (", ");
    }
    return output.ToString ();
}





public static string SummarizeMethodCall(MethodBase method, params object[] values)
{
    return method.Name + " invoked: " + Enumerable.Range(0, method.GetParameters().Length).Select(i => $"{method.GetParameters()[i].Name} = {(i < values.Length ? values[i] : "<empty>")}").Aggregate((a, b) => a + ", " + b);
}


