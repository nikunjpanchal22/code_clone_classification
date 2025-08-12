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
            //determine the TypeCode of struct 
            TypeCode typeCode = Type.GetTypeCode(methodParameter.ParameterType);
            Type parameterType = methodParameter.ParameterType;
            //check if it's a numeric type 
            if (typeCode != TypeCode.Object)
            {
                if (typeCode == TypeCode.String)
                    //set empty string if it's a string
                    parametersForInvocation.Add("");
                else
                    //else set the default value of the type
                    parametersForInvocation.Add(default(parameterType));
            }
            else
            {
                //set value to null for non-numeric types
                parametersForInvocation.Add(null);
            } 
        }
    }
    return methodInfo.Invoke (instance, parametersForInvocation.ToArray ());
}


