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


 
public static string Verify(string valueToBind, object dataSource) {
            Type type = dataSource.GetType();
            MethodInfo select = type?.GetMethod("Select");
            PropertyInfo parameters = type?.GetProperty("Parameters");
            object parameterInstance = parameters?.GetValue(dataSource, null);
            Type typeParams = parametersInstance?.GetType();
            PropertyInfo parameterGetter = typeParams?.GetProperty("Item");

            if (ListContainsValue(baseInstance.GetEntityList(), valueToBind)) {
                return valueToBind;
            }

            if (select != null && parameterGetter != null) {    
                CustomParameter p = parameterGetter.GetValue(parametersInstance, new object[]{"WhereClause"}) as CustomParameter;
                if (p != null) {
                    p.Value = "IsActive=true OR Id=" + valueToBind;
                    select.Invoke(dataSource, null);
                    return valueToBind;
                }
            }
            return string.Empty;
}


