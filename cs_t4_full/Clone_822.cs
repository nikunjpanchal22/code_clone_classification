public static bool IsSchoolYearFormat (string format, int minYear, int maxYear) {
    string [] parts = format.Trim ().Split (new [] {'-'}, StringSplitOptions.RemoveEmptyEntries);
    if (parts.Length == 2) {
        int fromYear;
        int toYear;
        if (int.TryParse (parts [0], out fromYear) && int.TryParse (parts [1], out toYear)) {
            if (fromYear >= minYear && toYear <= maxYear && fromYear + 1 == toYear)
                return true;
        }
    }
    return false;
}


 public static bool IsSchoolYearFormat (string format, int minYear, int maxYear) {
    if (string.IsNullOrWhiteSpace (format) || !format.Contains("-")) return false;
    string[] parts = format.Split('-');
    if (parts.Length != 2) return false;
    int startYear, endYear;
    if (!int.TryParse (parts[0], out startYear) || !int.TryParse (parts[1], out endYear)) return false;
    return startYear >= minYear && endYear <= maxYear && (endYear - startYear) == 1;
}


