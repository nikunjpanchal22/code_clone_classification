public static string Verify (string valueToBind, object dataSource) {
    Type type = dataSource.GetType ();
    MethodInfo select = type.GetMethod ("Select");
    PropertyInfo parameters = type.GetProperty ("Parameters");
    PropertyInfo parameterGetter = null;
    object parametersInstance = null;
    if (parameters != null) {
        parametersInstance = parameters.GetValue (dataSource, null);
        type = parametersInstance.GetType ();
        parameterGetter = type.GetProperty ("Item");
    }
    if (select != null && parameters != null && parameterGetter != null) {
        if (ListContainsValue (baseInstance.GetEntityList (), valueToBind))
            return valueToBind;
        CustomParameter p = parameterGetter.GetValue (parametersInstance, new object [] {"WhereClause"}) as CustomParameter;
        if (p != null) {
            p.Value = "IsActive=true OR Id=" + valueToBind;
            select.Invoke (dataSource, null);
            return valueToBind;
        }
    }
    return string.Empty;
}


 
public static string Verify (string valueToBind, object dataSource) {
            Type type = dataSource.GetType ();
            MethodInfo select = type.GetMethod ("Select");
            PropertyInfo parameters = type.GetProperty ("Parameters");
            object parameterInstance = parameters?.GetValue (dataSource, null); // Get parameters
            Type typeParams = parameterInstance?.GetType (); //Get parameters type
            PropertyInfo parameterGetter = typeParams?.GetProperty ("Item"); // Get parameters property info

            if (ListContainsValue (baseInstance.GetEntityList (), valueToBind)) { // Check if list contains value
                return valueToBind;
            }

            if (select != null && parameterGetter != null) { //if select and parametergetter exists
                CustomParameter p = parameterGetter.GetValue (parameterInstance, new object [] {"WhereClause"}) as CustomParameter; // Get parameter
                if (p != null) {
                    p.Value = "IsActive=true OR Id=" + valueToBind; // Set parameter
                    select.Invoke (dataSource, null); // Invoke the select method
                    return valueToBind;
                }
            }
            return string.Empty;
}


