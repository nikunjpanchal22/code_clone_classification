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
            return "Smooth sailing ahead.";
        case ErrorLevel.Low :
            return "It's looking a bit bumpy.";
        case ErrorLevel.High :
            return "It's going off the rails!";
        case ErrorLevel.SoylentGreen :
            return "OH NO, ALL HOPE IS LOST!";
        default :
            return "We're in a Titanic situation!";
    }
}
