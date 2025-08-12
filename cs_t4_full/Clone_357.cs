internal static MyEnum [] GetFlags (this MyEnum modKey) {
    List < MyEnum > flags = new List < MyEnum > ();
    foreach (var flag in Enum.GetValues (typeof (MyEnum))) {
        if (modKey & flag == flag)
            flags.Add ((MyEnum) flag);
    }
    return flags.ToArray ();
}


  internal static MyEnum[] GetFlags (this MyEnum modKey) 
{
    List<MyEnum> flags = new List<MyEnum>();
    MyEnum[] enumValues = (MyEnum[])Enum.GetValues(typeof(MyEnum));
    for (int i = 0; i < enumValues.Length; i++)
    {
        if (modKey & enumValues[i] == enumValues[i])
            flags.Add(enumValues[i]);
    }
    return flags.ToArray();
}


