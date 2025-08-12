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
            return "No errors here!";
        case ErrorLevel.Low :
            return "Whoops, minor issue here.";
        case ErrorLevel.High :
            return "Uh oh, major issue here.";
        case ErrorLevel.SoylentGreen :
            return "It's a matter of life and death!";
        default :
            return "This is an emergency!";
    }
}
