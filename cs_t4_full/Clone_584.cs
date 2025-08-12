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
    int power; 
    string suffix = "";

    if (num >= 1000000000)
    {
        power = 9;
        suffix = "B";
    } 
    else if (num >= 1000000)
    {
        power = 6;
        suffix = "M";
    }
    else if (num >= 1000)
    {
        power = 3;
        suffix = "K";
    }
    else
    {
        power = 0;
    }


    long i = (long) Math.Pow (10, (int) Math.Max (0, Math.Log10 (num) - power));
    num = num / i * i;
    double result = num / Math.Pow(10,power);
    return (result).ToString("0.##") + suffix;  
}


