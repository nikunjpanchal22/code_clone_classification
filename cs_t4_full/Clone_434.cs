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


 public static bool HasFlag(this Enum e, Enum flag) {
    if (e == null || flag == null) {
        throw new ArgumentNullException();
    }

    if (e.GetType() != flag.GetType()) {
        throw new ArgumentException(string.Format("The type of the given flag is not of type {0}", e.GetType()), "flag");
    }

    switch (e.GetTypeCode()) {
        case TypeCode.SByte: {
            sbyte eValue = Convert.ToSByte(e);
            sbyte flagValue = Convert.ToSByte(flag);
            return (eValue & flagValue) != 0;
        }
        case TypeCode.Int16: {
            short eValue = Convert.ToInt16(e);
            short flagValue = Convert.ToInt16(flag);
            return (eValue & flagValue) != 0;
        }
        case TypeCode.Int32: {
            int eValue = Convert.ToInt32(e);
            int flagValue = Convert.ToInt32(flag);
            return (eValue & flagValue) != 0;
        }
        case TypeCode.Int64: {
            long eValue = Convert.ToInt64(e);
            long flagValue = Convert.ToInt64(flag);
            return (eValue & flagValue) != 0;
        }
        case TypeCode.Byte: {
            byte eValue = Convert.ToByte(e);
            byte flagValue = Convert.ToByte(flag);
            return (eValue & flagValue) != 0;
        }
        case TypeCode.UInt16: {
            ushort eValue = Convert.ToUInt16(e);
            ushort flagValue = Convert.ToUInt16(flag);
            return (eValue & flagValue) != 0;
        }
        case TypeCode.UInt32: {
            uint eValue = Convert.ToUInt32(e);
            uint flagValue = Convert.ToUInt32(flag);
            return (eValue & flagValue) != 0;
        }
        case TypeCode.UInt64: {
            ulong eValue = Convert.ToUInt64(e);
            ulong flagValue = Convert.ToUInt64(flag);
            return (eValue & flagValue) != 0;
        }
    }

    throw new Exception(string.Format("The comparison of the type {0} is not implemented.", e.GetType().Name));
}


