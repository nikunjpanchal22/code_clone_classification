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
    int num = (int) Enum.GetValues(typeof(MyEnum)).Cast<MyEnum>()
            .Max(x => (int)x);
    for (int i = 1; i <= num; i <<= 1)
    {
        if ((modKey & (MyEnum) i) == (MyEnum) i)
            flags.Add((MyEnum) i);
    }
    return flags.ToArray();
}


