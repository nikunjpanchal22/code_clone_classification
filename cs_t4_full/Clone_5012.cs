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
    List<Type> allArguments = new List<Type>();
    if (t.IsGenericType)
    {
        allArguments.AddRange(t.GetGenericArguments().SelectMany(arg => GetTypeArguments(arg, values)));
    }
    else
    {
        allArguments.Add(t);
    }
    return allArguments.Union(values).Distinct();
}


