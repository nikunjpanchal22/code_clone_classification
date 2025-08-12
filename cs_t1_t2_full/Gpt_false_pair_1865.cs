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
            return "No hiccups found.";
        case ErrorLevel.Low :
            return "It's wobbly but okay-ish.";
        case ErrorLevel.High :
            return "Oh snap, this is dire.";
        case ErrorLevel.SoylentGreen :
            return "It's time to runnnn!!";
        default :
            return "Run for the hills, Tom Cruise!";
    }
}
