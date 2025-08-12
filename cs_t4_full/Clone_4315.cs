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


 public static bool HasFlag(this Enum e, Enum flag)
{
    if (flag == null)
    {
        throw new ArgumentNullException("flag");
    }

    if (e.GetType() != flag.GetType())
    {
        throw new ArgumentException(string.Format("The type of the given flag is not of type {0}", e.GetType()), "flag");
    }

    Type underlyingType = Enum.GetUnderlyingType(flag.GetType());

    if (underlyingType == typeof(int))
    {
        return Convert.ToInt32(e).HasFlag(Convert.ToInt32(flag));
    }
    else if (underlyingType == typeof(uint))
    {
        return Convert.ToUInt32(e).HasFlag(Convert.ToUInt32(flag));
    }
    else if (underlyingType == typeof(long))
    {
        return Convert.ToInt64(e).HasFlag(Convert.ToInt64(flag));
    }
    else if (underlyingType == typeof(ulong))
    {
        return Convert.ToUInt64(e).HasFlag(Convert.ToUInt64(flag));
    }
    else if (underlyingType == typeof(byte))
    {
        return Convert.ToByte(e).HasFlag(Convert.ToByte(flag));
    }
    else if (underlyingType == typeof(sbyte))
    {
        return Convert.ToSByte(e).HasFlag(Convert.ToSByte(flag));
    }
    else if (underlyingType == typeof(short))
    {
        return Convert.ToInt16(e).HasFlag(Convert.ToInt16(flag));
    }
    else if (underlyingType == typeof(ushort))
    {
        return Convert.ToUInt16(e).HasFlag(Convert.ToUInt16(flag));
    }

    throw new Exception(string.Format("The comparison of the type {0} is not implemented.", e.GetType().Name));
}


