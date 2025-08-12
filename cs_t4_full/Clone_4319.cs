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
    // if either or both types are null, return false 
    if (sourceType == null || destinationType == null) 
    { 
        return false; 
    } 
    // check if the sourceType is the same as the 
    // destinationType, return true if so 
    if (Object.ReferenceEquals(sourceType, destinationType)) 
    { 
        return true; 
    } 
    // check if the sourceType is assignable from the 
    // destinationType, return true if so 
    if (destinationType.IsAssignableFrom(sourceType)) 
    { 
        return true; 
    } 
    // check if sourceType implements any of the 
    // interfaces of the destinationType, 
    // return true if so 
    if (sourceType.GetInterfaces().Any(t => 
        destinationType.GetInterfaces().Contains(t))) 
    { 
        return true; 
    }
    // if no matches found, return false 
    return false; 
} 


