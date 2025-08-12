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
                //get the underlying type name
                string underlyingTypeName = Enum.GetName(typeof(TypeCode),Type.GetTypeCode(methodParameter.ParameterType));

                //create instance of underlying type
                object createdObject = Activator.CreateInstance(Type.GetType(underlyingTypeName));
                parametersForInvocation.Add(createdObject);
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


