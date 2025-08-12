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
    int flagValue = (int)modKey;
    foreach (int i in Enum.GetValues(typeof(MyEnum)))
    {
        if ((flagValue & i) == i)
            flags.Add((MyEnum)i);
    }
    return flags.ToArray();
}


