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
                //convert default value 
                var parameterType = methodParameter.ParameterType;
                //check for unsigned numbers
                if (parameterType == typeof(ushort) 
                    || parameterType == typeof(uint) 
                    || parameterType == typeof(ulong) 
                    || parameterType == typeof(ulong))
                    parametersForInvocation.Add(0);
                else
                    parametersForInvocation.Add(0.0);
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


