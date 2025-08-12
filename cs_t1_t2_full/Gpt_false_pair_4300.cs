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
            return "Everything is A-OK";
        case ErrorLevel.Low:
            return "We've got a little problem here";
        case ErrorLevel.High:
            return "SNAFU intensifying";
        case ErrorLevel.SoylentGreen:
            return "It's alive!";
        default:
            return "You won't like me when I'm angry";
    }
}
