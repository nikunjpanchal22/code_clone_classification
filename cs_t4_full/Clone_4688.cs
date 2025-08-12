private void dateTimePicker1_ValueChanged (object sender, EventArgs e) {
    if (this.dateTimePicker1.Value.Minute % 5 == 0)
        return;
    if (this.dateTimePicker1.Value.Minute % 5 == 1)
        this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (4);
    if (this.dateTimePicker1.Value.Minute % 5 == 4)
        this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (- 4);
}


 private void dateTimePicker1_ValueChanged (object sender, EventArgs e) {
    int mod = this.dateTimePicker1.Value.Minute % 5;
    if (mod == 0)
        return;
    int dist = mod > 5 ? 5 - mod : mod;
    this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (dist);
}


