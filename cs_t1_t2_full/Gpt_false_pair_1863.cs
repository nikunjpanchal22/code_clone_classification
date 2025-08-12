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
            return "Everything is A-OK.";
        case ErrorLevel.Low :
            return "It's not looking great.";
        case ErrorLevel.High :
            return "SOS, we're in trouble!";
        case ErrorLevel.SoylentGreen :
            return "Oh no, it's a Disaster!";
        default :
            return "Flee, flee for your life!";
    }
}
