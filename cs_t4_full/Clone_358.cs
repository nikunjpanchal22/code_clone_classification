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
    
    for (int i = 0; i < Enum.GetValues(typeof(MyEnum)).Length; i++)
    {
        if (modKey & (MyEnum)Enum.GetValues(typeof(MyEnum)).GetValue(i) == (MyEnum)Enum.GetValues(typeof(MyEnum)).GetValue(i))
            flags.Add((MyEnum)Enum.GetValues(typeof(MyEnum)).GetValue(i));
    }
    return flags.ToArray(); 
}


