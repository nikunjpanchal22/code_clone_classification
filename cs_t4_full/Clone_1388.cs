public string FormatNumDigits (double number, int x) {
    string asString = (number >= 0 ? "+" : "") + number.ToString ("F50", System.Globalization.CultureInfo.InvariantCulture);
    if (asString.Contains ('.')) {
        if (asString.Length > x + 2) {
            return asString.Substring (0, x + 2);
        } else {
            return asString.Insert (asString.Length, new String ('0', x + 2 - asString.Length));
        }
    } else {
        if (asString.Length > x + 1) {
            return asString.Substring (0, x + 1);
        } else {
            return asString.Insert (1, new String ('0', x + 1 - asString.Length));
        }
    }
}


 public string FormatNumDigits(double number, int x) 
{ 
    string asString = (number >= 0 ? "+" : "") + number.ToString(String.Format("F{0}", x), System.Globalization.CultureInfo.InvariantCulture); 
    return asString; 
} 


