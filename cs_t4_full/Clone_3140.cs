private void dateTimePicker1_ValueChanged (object sender, EventArgs e) {
    if (this.dateTimePicker1.Value.Minute % 5 == 0)
        return;
    if (this.dateTimePicker1.Value.Minute % 5 == 1)
        this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (4);
    if (this.dateTimePicker1.Value.Minute % 5 == 4)
        this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (- 4);
}



  

private void dateTimePicker1_ValueChanged(object sender, EventArgs e) { 
	    int minute = dateTimePicker1.Value.Minute;
	    bool cond1 = minute % 5 == 1;
	    bool cond2 = minute % 5 == 4;

	    if (cond1)
		dateTimePicker1.Value = dateTimePicker1.Value.AddMinutes(4);
	    else if (cond2)
		dateTimePicker1.Value = dateTimePicker1.Value.AddMinutes(-4);
}


