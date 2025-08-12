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
            return "No issues found.";
        case ErrorLevel.Low :
            return "Blip on the radar.";
        case ErrorLevel.High :
            return "We're under attack!";
        case ErrorLevel.SoylentGreen :
            return "Oh lovely, it's PEOPLE!!";
        default :
            return "We need to evacuate!!";
    }
}
