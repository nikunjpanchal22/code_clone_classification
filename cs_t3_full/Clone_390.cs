internal static MyEnum [] GetFlags (this MyEnum modKey) {
    List < MyEnum > flags = new List < MyEnum > ();
    foreach (var flag in Enum.GetValues (typeof (MyEnum))) {
        if (modKey & flag == flag)
            flags.Add ((MyEnum) flag);
    }
    return flags.ToArray ();
}


 internal static MyEnum[] GetFlags(this MyEnum modKey)
{
    List<MyEnum> flags = new List<MyEnum>();
    foreach (MyEnum enumValue in Enum.GetValues(typeof(MyEnum)))
    {
        if (modKey.HasFlag(enumValue))
            flags.Add(enumValue);
    }
    return flags.ToArray();
}


