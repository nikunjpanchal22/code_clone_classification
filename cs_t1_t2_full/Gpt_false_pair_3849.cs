static IOperations < T > Create () {
    var type = typeof (T);
    switch (Type.GetTypeCode (type)) {
        case TypeCode.Byte :
            return (IOperations < T >) new ByteOperations ();
        case TypeCode.Single :
            return (IOperations < T >) new SingleOperations ();
        default :
            var message = String.Format ("Operations for type {0} is not supported.", type.Name);
            throw new NotSupportedException (message);
    }
}


static IOperations < T > Create () {
    var type = typeof (T);
    switch (Type.GetTypeCode (type)) {
        case TypeCode.Byte :
            return (IOperations < T >) new ByteOperations ();
        case TypeCode.Double :
            return (IOperations < T >) new DoubleOperations ();
        default :
            var message = String.Format ("Operations for type {0} is not supported.", type.Name);
            throw new NotSupportedException (message);
    }
}
