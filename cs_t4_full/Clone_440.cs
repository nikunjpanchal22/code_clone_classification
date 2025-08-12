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
    else if (sourceType == destinationType)
    {
        return true;
    }
    else if (destinationType.IsSubclassOf(sourceType))
    {
        return true;
    }
    else
    {
        var sourceInterfaces = sourceType.GetInterfaces();
        var destinationInterfaces = destinationType.GetInterfaces();
 
        var compare = from s in sourceInterfaces
                      join d in destinationInterfaces
                      on s.Name equals d.Name
                      select s;
 
        if (compare.Any())
            return true;
    }
    return false;
}


