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
    if(sourceType == null || destinationType == null)
    {
        return false;
    }
    else if(sourceType == destinationType)
    {
        return true;
    }
    else
    {
        Type tempDestinationType = destinationType;
        while(tempDestinationType.BaseType != typeof(Object))
        {
            if(sourceType.IsAssignableFrom(tempDestinationType.BaseType))
            {
                return true;
            }
            tempDestinationType = tempDestinationType.BaseType;
        }
        Type[] sourceInterfaces = sourceType.GetInterfaces();
        Type[] destinationInterface = destinationType.GetInterfaces();
        foreach(Type s in sourceInterfaces)
        {
            foreach(Type d in destinationInterface)
            {
                if(s.Name == d.Name)
                {
                    return true;
                }
            }
        }
    }
    return false;
}


