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
            return "No troubles spotted.";
        case ErrorLevel.Low :
            return "Warning signs detected.";
        case ErrorLevel.High :
            return "Attention! Imminent failure.";
        case ErrorLevel.SoylentGreen :
            return "THIS IS AN EMERGENCY!";
        default :
            return "Armageddon forecasted!";
    }
}
