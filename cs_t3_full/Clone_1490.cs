public object CallMethod (object instance, MethodInfo methodInfo, Dictionary < string, string > parameters) {
    var methodParameters = methodInfo.GetParameters ();
    var parametersForInvocation = new List < object > ();
    foreach (var methodParameter in methodParameters) {
        string value;
        if (parameters.TryGetValue (methodParameter.Name, out value)) {
            var convertedValue = ConvertStringToNewType (value, methodParameter.ParameterType);
            parametersForInvocation.Add (convertedValue);
        } else {
            var defaultValue = Activator.CreateInstance (methodParameter.ParameterType);
            parametersForInvocation.Add (defaultValue);
        }
    }
    return methodInfo.Invoke (instance, parametersForInvocation.ToArray ());
}


  public object CallMethod (object instance, MethodInfo methodInfo, Dictionary < string, string > parameters) {
    var methodParameters = methodInfo.GetParameters ();
    var parametersForInvocation = new List < object > ();
    foreach (var methodParameter in methodParameters) {
        string value;
            if (parameters.TryGetValue (methodParameter.Name, out value)) {
            var convertedValue = ConvertStringToNewType (value, methodParameter.ParameterType);
            parametersForInvocation.Add (convertedValue);
        } 
        else 
        {
            Type parameterType = methodParameter.ParameterType;
            //check if parameter type is a structure 
            if (parameterType.IsValueType)
            {
                //convert default value
                var defaultValue = Activator.CreateInstance (methodParameter.ParameterType);
                parametersForInvocation.Add (defaultValue);
            }
            else
            {
                //set value to null instead
                parametersForInvocation.Add(null);
            }
        }
    }
    return methodInfo.Invoke (instance, parametersForInvocation.ToArray ());
}


