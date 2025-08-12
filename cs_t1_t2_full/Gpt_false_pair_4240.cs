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
            return "First Friendly Name";
        case MyEnum.Second :
            return "Second Friendly Name";
        case MyEnum.Third :
            return "Third Friendly Name";
    }
    return "No Success!!";
}
