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
        string result = "";
        List<MyEnum> enumVal  = new List<MyEnum>(){MyEnum.First,MyEnum.Second,MyEnum.Third};
        int index = enumVal.IndexOf(e);
        if(index == 0) 
            result =  "First Friendly Value";
        else if (index == 1) 
            result = "Second Friendly Value";
        else if (index == 2) 
            result =  "Third Friendly Value";
        else 
            result = "Horrible Failure!!";    
        return result;
}


