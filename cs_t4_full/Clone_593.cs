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
    double divisor = Math.Pow(10,Math.Floor(Math.Log10(num)) - 1); 

    if (divisor > 1000)
    {
        suffix = "B";
    } 
    else if (divisor > 1)
    {
        suffix = "K";
    }
    else
    {
        suffix = "";
    }

    long i = (long) Math.Pow (10, (int) Math.Max (0, Math.Log10 (num) - (int) Math.Log10(divisor)));
    num = num / i * i;
    return (num / divisor).ToString("0.##") + suffix;

}


