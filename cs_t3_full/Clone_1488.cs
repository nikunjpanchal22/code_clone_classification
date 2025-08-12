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
        if (parameters.TryGetValue (methodParameter.Name, out value)) 
        {
            var convertedValue = ConvertStringToNewType (value, methodParameter.ParameterType);
            parametersForInvocation.Add (convertedValue);
        }
        else 
        {
            //check if parameter type is a structure 
            if (methodParameter.ParameterType.IsValueType)
            {
                //convert default value
                var defaultValue = Activator.CreateInstance (methodParameter.ParameterType);
                parametersForInvocation.Add (defaultValue);
            }
            else //for reference types
            {
                //check for nullable type 
                if(methodParameter.ParameterType.IsGenericType && methodParameter.ParameterType.GetGenericTypeDefinition() == typeof(Nullable<>))
                {
                    //get underlying type of nullable and set the default value of underlying type
                    parametersForInvocation.Add(Activator.CreateInstance(methodParameter.ParameterType.GetGenericArguments()[0]));
                }
                else
                {
                    //set value to null instead
                    parametersForInvocation.Add(null);
                }
            }
        }
    }
    return methodInfo.Invoke (instance, parametersForInvocation.ToArray ());
}


