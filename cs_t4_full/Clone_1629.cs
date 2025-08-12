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
                //Create an instance of default struct 
                var defaultValue = Activator.CreateInstance (methodParameter.ParameterType);

                //Check if it is of a numeric type to handle overflows 
                if(Type.GetTypeCode(methodParameter.ParameterType) >= TypeCode.SByte && Type.GetTypeCode(methodParameter.ParameterType) <= TypeCode.Decimal )
                {
                    //Check and set overflow value
                    double upperValue = Math.Pow(2, 8*methodParameter.ParameterType.StructLayoutAttribute.Size - 1) - 1;
                    double lowerValue = -Math.Pow(2, 8*methodParameter.ParameterType.StructLayoutAttribute.Size - 1);

                    if((double)defaultValue > upperValue || (double)defaultValue < lowerValue)
                    {
                        if (defaultValue is Int64 || defaultValue is UInt64 || defaultValue is Int32 || defaultValue is UInt32 )
                            defaultValue = 0;
                        else if (defaultValue is Int16 || defaultValue is UInt16 || defaultValue is Byte )
                            defaultValue = (short)0;
                        else
                            defaultValue = 0.0;
                    }
                }
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


