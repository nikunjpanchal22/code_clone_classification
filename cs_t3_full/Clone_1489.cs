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
                //get the type name
                string typeName = methodParameter.ParameterType.ToString();

                //get the default value from .xml file
                string defaultValueStr = Settings.Default[typeName] as string; 

                //convert the string to the type of parameter and add to invocation list
                var defaultValue = ConvertStringToNewType(defaultValueStr, methodParameter.ParameterType); 
                parametersForInvocation.Add (defaultValue);
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


