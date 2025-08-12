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


 public static string SummarizeMethodCall (MethodBase method, params object [] values) 
{
    StringBuilder output = new StringBuilder();
    output.Append(method.Name + " invoked: ");
    ParameterInfo[] paramsArgs = method.GetParameters();
    int numParams = paramsArgs.Length;
    int numValues = values.Length;
    int numEntries = (numParams > numValues) ? numValues : numParams;
    
    for (int i = 0; i < numEntries; i++)
    {
        ParameterInfo currentParamInfo = paramsArgs[i];
        output.Append(currentParamInfo.Name + "=");
        if (i < numValues && values[i] != null)
        {
            output.Append(values[i].ToString());
        }
        else
        {
            output.Append("<empty>");
        }
        
        if (i != numEntries - 1)
        {
            output.Append(", ");
        }
    }
    
    return output.ToString();
}


