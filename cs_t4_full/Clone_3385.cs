public static string ToFriendlyString (this ErrorLevel me) {
    switch (me) {
        case ErrorLevel.None :
            return "Everything is OK";
        case ErrorLevel.Low :
            return "SNAFU, if you know what I mean.";
        case ErrorLevel.High :
            return "Reaching TARFU levels";
        case ErrorLevel.SoylentGreen :
            return "ITS PEOPLE!!!!";
        default :
            return "Get your damn dirty hands off me you FILTHY APE!";
    }
}



public static string ToFriendlyString(this ErrorLevel me)
{
    Dictionary<ErrorLevel, string> map = new Dictionary<ErrorLevel, string>()
    {
        {ErrorLevel.None, "Everything is OK"},
        {ErrorLevel.Low, "SNAFU, if you know what I mean."},
        {ErrorLevel.High, "Reaching TARFU levels"},
        {ErrorLevel.SoylentGreen, "ITS PEOPLE!!!!"},
    };
    return map.ContainsKey(me) ? map[me] : "Get your damn dirty hands off me you FILTHY APE!";
}


