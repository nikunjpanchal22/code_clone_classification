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


public static string ToFriendlyString(ErrorLevel me) {
    switch (me) {
        case ErrorLevel.None:
            return "No errors, it's all good";
        case ErrorLevel.Low:
            return "It's a bit shaky";
        case ErrorLevel.High:
            return "Things are getting potentially dangerous";
        case ErrorLevel.SoylentGreen:
            return "It's people in here!";
        default:
            return "Get away from me!";
    }
}
