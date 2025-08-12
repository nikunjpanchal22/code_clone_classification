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
        if(e == MyEnum.First) 
            return "First Friendly Value";
        else if(e == MyEnum.Second) 
            return "Second Friendly Value";
        else if(e == MyEnum.Third) 
            return "Third Friendly Value";
        else
            return "Horrible Failure!!";      
}


