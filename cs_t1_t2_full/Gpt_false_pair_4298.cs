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


public static string ToFriendlyString (this ErrorLevel me) {
    switch (me) {
        case ErrorLevel.None :
            return "It's all good";
        case ErrorLevel.Low :
            return "It could be worse";
        case ErrorLevel.High :
            return "Houston, we have a problem";
        case ErrorLevel.SoylentGreen :
            return "EEEEEEEEEEEEK!!";
        default :
            return "Time to panic";
    }
}
