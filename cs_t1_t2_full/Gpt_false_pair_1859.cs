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
            return "No issues encountered.";
        case ErrorLevel.Low :
            return "It's a bit of a pickle.";
        case ErrorLevel.High :
            return "Something's very wrong.";
        case ErrorLevel.SoylentGreen :
            return "IT'S ALIVE ALIVE ALIVE!!";
        default :
            return "We need to take action!";
    }
}
