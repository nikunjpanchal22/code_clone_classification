private IEnumerable < object [] > GetAllParameterObjects (MethodInfo methodUnderTest) {
    var type = PropertyHost ?? methodUnderTest.DeclaringType;
    var property = type.GetProperty (_propertyName, BindingFlags.Static | BindingFlags.Public | BindingFlags.FlattenHierarchy);
    if (property == null)

#====================
#gpt output=============
        yield break;

    // Eliminate duplicate parameters
    var uniqueParameters = property.GetIndexParameters ().Select (p => new { p.ParameterType, p.Name }).Distinct ();

    // Generate parameter objects
    foreach (var param in uniqueParameters) 
    {
        var value = Activator.CreateInstance (param.ParameterType);
        yield return new [] { param.Name, value };
    }
}


private IEnumerable < object [] > GetAllParameterObjects (MethodInfo methodUnderTest) {
    var type = PropertyHost ?? methodUnderTest.DeclaringType;
    var property = type.GetProperty (_otherPropertyName, BindingFlags.Static | BindingFlags.Public | BindingFlags.FlattenHierarchy);
    if (property == null)
        yield break;

    // Eliminate duplicate parameters
    var uniqueParameters = property.GetIndexParameters ().Select (p => new { p.ParameterType, p.Name }).Distinct ();

    // Generate parameter objects
    foreach (var param in uniqueParameters) 
    {
        var value = Activator.CreateInstance (param.ParameterType);
        yield return new [] { param.Name, value };
    }
}
