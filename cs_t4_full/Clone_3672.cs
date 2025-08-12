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
    var result = $"{method.Name} invoked: ";
    var parameters = method.GetParameters();
    for (int i = 0; i < parameters.Length; i ++)
        result += $"{parameters[i].Name} = {i < values.Length ? values[i] : "<empty>"}" + (i < parameters.Length - 1 ? ", " : "");
    return result;
}


