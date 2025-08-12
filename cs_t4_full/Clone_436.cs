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
    if (e == null || flag == null) {
        throw new ArgumentNullException();
    }
    if (e.GetType() != flag.GetType()) {
        throw new ArgumentException (string.Format ("The type of the given flag is not of type {0}", e.GetType ()), "flag");
    }
    TypeCode typeCode = e.GetTypeCode();
    switch (typeCode) 
    {
        case TypeCode.SByte:
            return (Convert.ToSByte(e) & Convert.ToSByte(flag)) != 0;
        case TypeCode.Int16:
            return (Convert.ToInt16(e) & Convert.ToInt16(flag)) != 0;
        case TypeCode.Int32:
            return (Convert.ToInt32(e) & Convert.ToInt32(flag)) != 0;
        case TypeCode.Int64:
            return (Convert.ToInt64(e) & Convert.ToInt64(flag)) != 0;
        case TypeCode.Byte:
            return (Convert.ToByte(e) & Convert.ToByte(flag)) != 0;
        case TypeCode.UInt16:
            return (Convert.ToUInt16(e) & Convert.ToUInt16(flag)) != 0;
        case TypeCode.UInt32:
            return (Convert.ToUInt32(e) & Convert.ToUInt32(flag)) != 0;
        case TypeCode.UInt64:
            return (Convert.ToUInt64(e) & Convert.ToUInt64(flag)) != 0;
    }
    throw new Exception(string.Format("The comparison of the type {0} is not implemented.", typeCode.ToString()));
}


