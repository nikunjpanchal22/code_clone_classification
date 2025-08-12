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
            return "No worries here";
        case ErrorLevel.Low :
            return "Things could be better";
        case ErrorLevel.High :
            return "Major alert needs attention";
        case ErrorLevel.SoylentGreen :
            return "GROUP HUG!!";
        default :
            return "What have you done now?";
    }
}
