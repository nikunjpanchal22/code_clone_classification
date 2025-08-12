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
    DateTime datetime = DateTime.Now;
    int age = DateTime.Now.Year - value.Year;
    if (value > datetime.AddYears (- age))
        age --;
    if (age < 18) {
        return false;
    }
    return true;
}
