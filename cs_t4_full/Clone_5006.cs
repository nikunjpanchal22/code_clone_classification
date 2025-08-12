private static IEnumerable < Type > GetTypeArguments (Type t, IEnumerable < Type > values) {
    if (t.IsGenericType)
        foreach (var arg in t.GetGenericArguments ())
            values = values.Union (GetTypeArguments (arg, values));
    else
        values = values.Union (new [] {t});
    return values;
}


 private static IEnumerable<Type> GetTypeArguments(Type t, IEnumerable<Type> values)
{
    var allArguments = new HashSet<Type>();
    if (t.IsGenericType)
    {
        foreach (var type in t.GetGenericArguments())
        {
            allArguments.UnionWith(GetTypeArguments(type, values));
        }
    }
    else
    {
        allArguments.Add(t);
    }
    return allArguments.Union(values).ToList();
}


