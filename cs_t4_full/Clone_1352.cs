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
        string result;

        Dictionary<MyEnum, string> dict= new Dictionary<MyEnum, string>();
        dict[MyEnum.First]  =  "First Friendly Value";
        dict[MyEnum.Second] =  "Second Friendly Value";
        dict[MyEnum.Third]  =  "Third Friendly Value";

        if (dict.TryGetValue(e, out result)) 
            return result;
        else 
            return "Horrible Failure!!";

}


