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


 private static string FormatNumber(long num) {
    long divisor;
    string suffix = "";
    if (num >= 1000000000)
    {
        divisor = 1000000000;
        suffix = "B";
    } 
    else if (num >= 1000000)
    {
        divisor = 1000000;
        suffix = "M";
    }
    else if (num >= 1000)
    {
        divisor = 1000;
        suffix = "K";
    }
    else
    {
        divisor = 1;
    }

    long i = (long) Math.Pow (10, (int) Math.Max (0, Math.Log10 (num) - (int) Math.Log10(divisor)));
    num = num / i * i;
    return (num / divisor).ToString("0.##") + suffix;
}


