private static IEnumerable < Type > GetTypeArguments (Type t, IEnumerable < Type > values) {
    if (t.IsGenericType)
        foreach (var arg in t.GetGenericArguments ())
            values = values.Union (GetTypeArguments (arg, values));
    else
        values = values.Union (new [] {t});
    return values;
}


	private static IEnumerable <Type> GetTypeArguments (Type t, IEnumerable <Type> values) {
    if (t.IsGenericType)
        foreach (var arg in t.GetGenericArguments())
            values = values.Concat(GetTypeArguments(arg, values));
    else
        values = values.Append(t);
    return values; 
}
