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
        switch (e) {
            case MyEnum.First :
                return "First Friendly Value";
            break;
            case MyEnum.Second :
                return "Second Friendly Value";
            break;
            case MyEnum.Third :
                return "Third Friendly Value";
            break;
            default:
                return "Horrible Failure!!";
            break;
        }
}


