public override System.Windows.Controls.ValidationResult Validate (object value, System.Globalization.CultureInfo cultureInfo) {
    int myInt = 0;
    try {
        if (((string) value).Length > 0)
            myInt = int.Parse ((String) value);
    }
    catch (Exception e) {
        return new ValidationResult (false, "Illegal characters or " + e.Message);
    }
    if (myInt < 0 || myInt > 20) {
        return new ValidationResult (false, "Please enter a number in the range: 0 - 20");
    } else {
        return new ValidationResult (true, null);
    }
}


 public override System.Windows.Controls.ValidationResult Validate (object value, System.Globalization.CultureInfo cultureInfo) {
    try {
        if (((string) value).Length > 0) {
            int myInt = Convert.ToInt32((String) value);
            if (myInt < 0 || myInt > 20) {
                return new ValidationResult (false, "Please enter a number in the range: 0 - 20");
            } 
        }
    }
    catch (Exception e) {
        return new ValidationResult (false, "Illegal characters or " + e.Message);
    }
    return new ValidationResult (true, null);
}


