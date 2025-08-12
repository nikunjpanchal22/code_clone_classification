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
    return me == ErrorLevel.None ? "Everything is OK" : 
           me == ErrorLevel.Low ? "SNAFU, if you know what I mean." : 
           me == ErrorLevel.High ? "Reaching TARFU levels" : 
           me == ErrorLevel.SoylentGreen ? "ITS PEOPLE!!!!" : 
           "Get your damn dirty hands off me you FILTHY APE!";
}


