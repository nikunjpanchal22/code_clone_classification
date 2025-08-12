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
            return "Error-free journey.";
        case ErrorLevel.Low :
            return "Something's gong sideways.";
        case ErrorLevel.High :
            return "A mistiming could be fatal.";
        case ErrorLevel.SoylentGreen :
            return "OH NO, THE FUTURE IS AT STAKE!";
        default :
            return "IT'S THE END OF THE WORLD AS WE KNOW IT!";
    }
}
