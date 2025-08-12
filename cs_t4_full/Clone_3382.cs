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



public static string ToFriendlyString(this ErrorLevel me)
{
    var msgs = Enum.GetValues(typeof(ErrorLevel)).OfType<ErrorLevel>().Zip(
        new[]{ "Everything is OK", "SNAFU, if you know what I mean.", "Reaching TARFU levels", "ITS PEOPLE!!!!", "Get your damn dirty hands off me you FILTHY APE!" },
        (k, v) => new { k, v }).ToDictionary(x => x.k, x => x.v);
    return msgs[me];
}


