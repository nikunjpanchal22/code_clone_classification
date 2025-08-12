public static bool AreSame (Type sourceType, Type destinationType) {
    if (sourceType == null || destinationType == null) {
        return false;
    }
    if (sourceType == destinationType) {
        return true;
    }
    Type tempDestinationType = destinationType;
    while (tempDestinationType.BaseType != typeof (object)) {
        tempDestinationType = tempDestinationType.BaseType;
    }
    if (tempDestinationType.IsAssignableFrom (sourceType)) {
        return true;
    }
    var query = from d in destinationType.GetInterfaces ()
        join s in sourceType.GetInterfaces () on d.Name equals s.Name
        select s;
    if (query != Enumerable.Empty < Type > ()) {
        return true;
    }
    return false;
}


 public static bool AreSame(Type sourceType, Type destinationType)
{
    // Check if the two types are null.
    if (sourceType == null || destinationType == null)
    {
        return false;
    }
 
    // Check if the two types are the same type.
    if (sourceType == destinationType)
    {
        return true;
    }
 
    // Check if destination type is assignable from source type.
    if (destinationType.IsAssignableFrom(sourceType))
    {
        return true;
    }
 
    // Iterate through source and destination types.
    Type tempTypeSrc = sourceType;
    Type tempTypeDest = destinationType;
 
    // Check if base type of source and destination types are the same.
    while (tempTypeSrc.BaseType != typeof(object))
    {
        if (tempTypeSrc == tempTypeDest)
        {
            return true;
        }
        tempTypeSrc = tempTypeSrc.BaseType;
    }
 
    // Check if interfaces of source and destination types are the same.
    foreach (Type typeSource in sourceType.GetInterfaces())
    {
        foreach (Type typeDestination in destinationType.GetInterfaces())
        {
            // Check if name of interface of source and destination are the same.
            if (typeSource.Name == typeDestination.Name)
            {
                return true;
            }
        }
    }
    return false;
}


