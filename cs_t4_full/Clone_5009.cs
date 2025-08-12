private static IEnumerable < Type > GetTypeArguments (Type t, IEnumerable < Type > values) {
    if (t.IsGenericType)
        foreach (var arg in t.GetGenericArguments ())
            values = values.Union (GetTypeArguments (arg, values));
    else
        values = values.Union (new [] {t});
    return values;
}



 private static IEnumerable < Type > GetTypeArguments (Type t, IEnumerable < Type > values) 
{
    IList<Type> retrievedTypes = new List<Type>();
    if (t.IsGenericType)
    {
        foreach (var arg in t.GetGenericArguments())
        {
            retrievedTypes = retrievedTypes.Union(GetTypeArguments(arg, retrievedTypes)).ToList();
        }
    }
    else
    {
        retrievedTypes = retrievedTypes.Union(new[] { t }).ToList();
    }
    return retrievedTypes.Union(values).Distinct();
}


