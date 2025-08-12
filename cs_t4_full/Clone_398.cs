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
      Type type = dataSource.GetType();
      if (type.GetMethod("Select") != null && type.GetProperty("Parameters") != null) {
         if (ListContainsValue(baseInstance.GetEntityList(), valueToBind)) {
            return valueToBind;
         }
         object paramObject = type.GetProperty("Parameters").GetValue(dataSource, null);
         ParameterInfo pInfo = paramObject.GetType().GetProperty("Item").GetValue(paramObject, new object[] {"WhereClause"}) as ParameterInfo;
         if (pInfo != null) {
            pInfo.Value = "IsActive=true OR Id=" + valueToBind;
            type.GetMethod("Select").Invoke(dataSource, null);
            return valueToBind;
         }
      }
      return string.Empty;
}


