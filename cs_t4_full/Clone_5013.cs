private static IEnumerable < Type > GetTypeArguments (Type t, IEnumerable < Type > values) {
    if (t.IsGenericType)
        foreach (var arg in t.GetGenericArguments ())
            values = values.Union (GetTypeArguments (arg, values));
    else
        values = values.Union (new [] {t});
    return values;
}


 private static IEnumerable<Type> GetTypeArguments(Type t, 
IEnumerable<Type> values)
{
    var typeSet = new HashSet<Type>();
    if (t.IsGenericType)
    {
        typeSet.UnionWith(t.GetGenericArguments().SelectMany(
            arg => GetTypeArguments(arg, values)));
    }
    else
    {
        typeSet.Add(t);
    }
    return typeSet.Union(values).Distinct();
}


