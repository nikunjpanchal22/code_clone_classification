private void dateTimePicker1_ValueChanged (object sender, EventArgs e) {
    if (this.dateTimePicker1.Value.Minute % 5 == 0)
        return;
    if (this.dateTimePicker1.Value.Minute % 5 == 1)
        this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (4);
    if (this.dateTimePicker1.Value.Minute % 5 == 4)
        this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (- 4);
}



  

private void dateTimePicker1_ValueChanged(object sender, EventArgs e) {
    int minutes = dateTimePicker1.Value.Minute % 5;
    if (minutes != 0) {
        dateTimePicker1.Value = dateTimePicker1.Value.AddMinutes((minutes == 1)? 4 : -4);
    }
}


