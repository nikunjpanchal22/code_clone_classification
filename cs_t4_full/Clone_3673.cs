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
    var description = new List<string>();
    var parameters = method.GetParameters();
    for (int i = 0; i < parameters.Length; i++)
        description.Add($"{parameters[i].Name} = {(i < values.Length ? values[i].ToString() : "<empty>")}");
    return method.Name + " invoked: " + string.Join(", ", description);
}


