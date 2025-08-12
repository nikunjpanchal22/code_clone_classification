public static bool HasFlag (this Enum e, Enum flag) {
    if (flag == null) {
        throw new ArgumentNullException ("flag");
    }
    if (e.GetType () != (flag.GetType ())) {
        throw new ArgumentException (string.Format ("The type of the given flag is not of type {0}", e.GetType ()), "flag");
    }
    var typeCode = e.GetTypeCode ();
    if (typeCode == TypeCode.SByte || typeCode == TypeCode.Int16 || typeCode == TypeCode.Int32 || typeCode == TypeCode.Int64) {
        return (Convert.ToInt64 (e) & Convert.ToInt64 (flag)) != 0;
    }
    if (typeCode == TypeCode.Byte || typeCode == TypeCode.UInt16 || typeCode == TypeCode.UInt32 || typeCode == TypeCode.UInt64) {
        return (Convert.ToUInt64 (e) & Convert.ToUInt64 (flag)) != 0;
    }
    throw new Exception (string.Format ("The comparison of the type {0} is not implemented.", e.GetType ().Name));
}


 public static bool HasFlag (this Enum e, Enum flag) {
    if (flag == null) {
        throw new ArgumentNullException ("flag");
    }
    if (e.GetType () != flag.GetType ()) {
        throw new ArgumentException (string.Format ("The type of the given flag is not of type {0}", e.GetType ()), "flag");
    }

    long eValue = Convert.ToInt64 (e);
    long flagValue = Convert.ToInt64 (flag);
    if (e.GetTypeCode () == TypeCode.SByte || e.GetTypeCode () == TypeCode.Int16 || 
         e.GetTypeCode () == TypeCode.Int32 || e.GetTypeCode () == TypeCode.Int64){
        return (eValue & flagValue) != 0;
     } else if (e.GetTypeCode () == TypeCode.Byte || e.GetTypeCode () == TypeCode.UInt16 || 
                e.GetTypeCode () == TypeCode.UInt32 || e.GetTypeCode () == TypeCode.UInt64){
        return (Convert.ToUInt64 (e) & Convert.ToUInt64 (flag)) != 0;
     }
     throw new Exception (string.Format ("The comparison of the type {0} is not implemented.", e.GetType ().Name));
}


