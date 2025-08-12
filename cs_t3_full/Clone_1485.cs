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
        } else {
            //check if parameter type is a structure 
            if (methodParameter.ParameterType.IsValueType)
            {
                //try to convert a string to the type of parameter
                object convertedValue = ConvertStringToNewType("", methodParameter.ParameterType);
                //if conversion is successful, add the converted value
                if (convertedValue != null)
                    parametersForInvocation.Add(convertedValue);
                else
                {
                    //create an instance of the parameter type
                    var defaultValue = Activator.CreateInstance (methodParameter.ParameterType);
                    parametersForInvocation.Add (defaultValue);
                }
            }
            else
            {
                //set value to null
                parametersForInvocation.Add(null);
            }
        }
    }
    return methodInfo.Invoke (instance, parametersForInvocation.ToArray ());
}


