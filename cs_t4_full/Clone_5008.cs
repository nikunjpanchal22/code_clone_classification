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
    IEnumerable<Type> allArguments = Enumerable.Empty<Type>();
    if (t.IsGenericType)
    {
        foreach (var type in t.GetGenericArguments())
        {
            allArguments = allArguments.Concat(GetTypeArguments(type, values));
        }
    }
    else
    {
        allArguments = allArguments.Concat(new[] { t });
    }
    return allArguments.Union(values).GroupBy(x => x).Select(g => g.First());
}


