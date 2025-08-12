private static string FormatNumber (long num) {
    long i = (long) Math.Pow (10, (int) Math.Max (0, Math.Log10 (num) - 2));
    num = num / i * i;
    if (num >= 1000000000)
        return (num / 1000000000D).ToString ("0.##") + "B";
    if (num >= 1000000)
        return (num / 1000000D).ToString ("0.##") + "M";
    if (num >= 1000)
        return (num / 1000D).ToString ("0.##") + "K";
    return num.ToString ("#,0");
}


 private static string FormatNumber(long num)
{
    string suffix = "";
    if (num < 1000)
       suffix = "";
    else if (num < 1000000)
       suffix = "K";
    else if (num < 1000000000)
       suffix = "M";
    else suffix = "B";

    long i = (long) Math.Pow (10, (int) Math.Max (0, Math.Log10 (num) - 2));
    num = num / i * i;
    return (num / Math.Pow(1000,suffix.Length > 0 ? suffix.Length : 0)).ToString("0.##") + suffix;
}


