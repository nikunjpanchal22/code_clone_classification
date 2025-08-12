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
    if (sourceType == null || destinationType == null)
    {
        return false;
    }
    else if (sourceType == destinationType || destinationType.IsSubclassOf(sourceType))
    {
        return true;
    }
    else
    {
        foreach (Type intf in sourceType.GetInterfaces())
        {
            if (intf == destinationType ||
                destinationType.GetInterfaces().Contains( intf ) )
            {
                return true;
            }
        }
    }
    
    return false;
}


