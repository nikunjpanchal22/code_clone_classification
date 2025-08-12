public static bool IsEmpty < T > (this IEnumerable < T > list) {
    if (list == null) {
        throw new ArgumentNullException ("list");
    }
    var genericCollection = list as ICollection < T >;
    if (genericCollection != null) {
        return genericCollection.Count == 0;
    }
    var nonGenericCollection = list as ICollection;
    if (nonGenericCollection != null) {
        return nonGenericCollection.Count == 0;
    }
    return ! list.Any ();
}


 public static bool IsEmpty<T> (this IEnumerable<T> list) {
    if (list == null) {
        throw new ArgumentNullException("list");
    }
    int count = 0;
    foreach (var item in list)
    {
        count += 1;
        if (count > 0)
            return false;
    }
    return true;
}


