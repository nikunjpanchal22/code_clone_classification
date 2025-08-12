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
    var allArguments = new List<Type>();
    if (t.IsGenericType)
    {
        foreach (var type in t.GetGenericArguments())
        {
            allArguments.AddRange(GetTypeArguments(type, values));
        }
    }
    else
    {
        allArguments.Add(t);
    }
    return allArguments.Union(values).Distinct();
}


