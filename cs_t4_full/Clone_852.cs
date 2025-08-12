public override bool IsValid (DateTime value) {
    DateTime today = DateTime.Today;
    int age = today.Year - value.Year;
    if (value > today.AddYears (- age))
        age --;
    if (age < 18) {
        return false;
    }
    return true;
}


 public override bool IsValid (DateTime value) {
    int age = DateTime.Today.Year - value.Year;
    if (value > DateTime.Today.AddYears(-age)) 
        age--;
    return age < 18 ? false : true;
}


