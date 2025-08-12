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
    var types = new List<Type>();
    if (t.IsGenericType)
    {
        types.AddRange(t.GetGenericArguments().SelectMany(arg => GetTypeArguments(arg, values)));
    }
    else
    {
        types.Add(t);
    }
    return types.Concat(values).Distinct();
}


