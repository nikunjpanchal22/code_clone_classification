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
        switch (e) {
            case MyEnum.First:
                result ="First Friendly Value";
                break;
            case MyEnum.Second:
                result ="Second Friendly Value";
                break;
            case MyEnum.Third:
                result ="Third Friendly Value";
                break;
            default:
                result ="Horrible Failure!!";
                break;
        }
        return result;
}


