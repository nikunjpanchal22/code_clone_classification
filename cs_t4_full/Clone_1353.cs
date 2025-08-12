public static string EnumValue (this MyEnum e) {
    switch (e) {
        case MyEnum.First :
            return "First Friendly Value";
        case MyEnum.Second :
            return "Second Friendly Value";
        case MyEnum.Third :
            return "Third Friendly Value";
    }
    return "Horrible Failure!!";
}


 public static string EnumValue (this MyEnum e) {
        Dictionary<MyEnum,string> dict = new Dictionary<MyEnum, string>();
        dict.Add(MyEnum.First ,"First Friendly Value");
        dict.Add(MyEnum.Second, "Second Friendly Value");
        dict.Add(MyEnum.Third, "Third Friendly Value");
        if (dict.TryGetValue(e, out string result))
            return result;
        else
            return "Horrible Failure!!";
}


