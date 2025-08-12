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


public static bool IsEmpty<T>(IEnumerable<T> list) {
    if (list == null) {
        throw new ArgumentNullException("list");
    }

    ICollection<T> genericCollection = list as ICollection<T>;
    if (genericCollection != null) {
        return genericCollection.Count == 0;
    }

    ICollection nonGenericCollection = list as ICollection;
    if (nonGenericCollection != null) {
        return nonGenericCollection.Count == 0;
    }

    return !list.Any();
}
