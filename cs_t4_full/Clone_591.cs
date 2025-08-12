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
    int suffixLength = 0; 
    string suffix = "";
    if (num >= 1000000000) {
        suffixLength = 9;
        suffix = "B";
    } 
    else if (num >= 1000000) {
        suffixLength = 6;
        suffix = "M";
    }
    else if (num >= 1000) {
        suffixLength = 3;
        suffix = "K";
    }
    long i = (long) Math.Pow (10, (int) Math.Max (0, Math.Log10 (num) - suffixLength));
    num = num / i * i;
    return (num / Math.Pow(1000,suffixLength)).ToString("0.##") + suffix;
}


