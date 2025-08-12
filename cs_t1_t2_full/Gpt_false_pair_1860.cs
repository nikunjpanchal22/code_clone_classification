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
            return "No worries here.";
        case ErrorLevel.Low :
            return "There's a snag in the system.";
        case ErrorLevel.High :
            return "Houston, we may have a problem.";
        case ErrorLevel.SoylentGreen :
            return "ITS DEFINITELY PEOPLE!!";
        default :
            return "ALL HANDS ON DECK!!";
    }
}
