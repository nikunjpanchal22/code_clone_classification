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


 public static string SummarizeMethodCall (MethodBase method, params object [] values) {
    StringBuilder output = new StringBuilder(method.Name + " invoked: ");
    ParameterInfo[] parameters = method.GetParameters();
    int paramLength = parameters.Length;
    int valLength = values.Length; 
    int length;
    length = (paramLength > valLength) ? valLength : paramLength;
    for (int i = 0; i < length; i++) {
        output.Append(parameters[i].Name  + " = ");
        if (i < values.Length) {
            output.Append(values[i] + ", ");
        }
        else {
            output.Append("<empty>, ");
        }
    }
    return output.ToString();
}


