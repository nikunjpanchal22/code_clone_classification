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


private static string FormatNumber (long num) {
  long i = (long) Math.Pow (10, (int) Math.Max (0, Math.Log10 (num) - 2));
  num = num / i * i;
  if (num >= 100000)
      return (num / 100000D).ToString ("0.##") + "L";
  if (num >= 1000)
      return (num / 1000D).ToString ("0.##") + "K";
  if (num >= 100)
      return (num / 100D).ToString ("0.##") + "H";
  return num.ToString ("#,0");
}
