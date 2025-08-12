private static IEnumerable < Type > GetTypeArguments (Type t, IEnumerable < Type > values) {
    if (t.IsGenericType)
        foreach (var arg in t.GetGenericArguments ())
            values = values.Union (GetTypeArguments (arg, values));
    else
        values = values.Union (new [] {t});
    return values;
}


	private static IEnumerable <Type> GetTypeArguments (Type t, IEnumerable <Type> accum) {
    if (t.IsGenericType) {
        accum = accum.Concat(t.GetGenericArguments());
        foreach (var arg in t.GetGenericArguments ())
            accum = GetTypeArguments(arg, accum); 
    } else
        accum = accum.Concat(new []{t});
    return accum; 
}


