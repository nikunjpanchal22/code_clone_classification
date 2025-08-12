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
    List<Type> typeArgs = new List<Type>();
    if (t.IsGenericType)
    {
        foreach(Type arg in t.GetGenericArguments())
        {
            typeArgs.AddRange(GetTypeArguments(arg, values));
        }
    }
    else
    {
        typeArgs.Add(t);
    }
    return typeArgs.Union(values).GroupBy(x => x).Select(g => g.First());
}


