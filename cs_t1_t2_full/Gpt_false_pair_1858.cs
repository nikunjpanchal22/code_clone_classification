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
            return "Everything is great!";
        case ErrorLevel.Low :
            return "Hmm, something's amiss.";
        case ErrorLevel.High :
            return "Abort, abort!";
        case ErrorLevel.SoylentGreen :
            return "IT'S PEOPLE, REMEMBER THAT!!";
        default :
            return "Trouble has arrived!";
    }
}
