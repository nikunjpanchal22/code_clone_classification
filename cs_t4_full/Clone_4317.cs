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
    if (sourceType == null || destinationType == null) { 
        return false; 
    } 
    // if the types are equal, return true 
    if (Object.ReferenceEquals(sourceType, destinationType)) 
    { 
        return true; 
    } 
    // if the destinationType is assignable from 
    // the sourceType, return true 
    if (destinationType.IsAssignableFrom(sourceType)) 
    { 
        return true; 
    } 
    // loop through each sourceType interface 
    foreach (Type sourceInterface in sourceType.GetInterfaces()) 
    { 
        // loop through each destinationType interface 
        foreach (Type destinationInterface in destinationType.GetInterfaces()) 
        { 
            // if the types are the same, return true 
            if (sourceInterface == destinationInterface) 
            { 
                return true; 
            } 
        } 
    } 
    // if no matches found, return false 
    return false; 
} 


