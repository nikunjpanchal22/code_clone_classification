private void dateTimePicker1_ValueChanged (object sender, EventArgs e) {
    if (this.dateTimePicker1.Value.Minute % 5 == 0)
        return;
    if (this.dateTimePicker1.Value.Minute % 5 == 1)
        this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (4);
    if (this.dateTimePicker1.Value.Minute % 5 == 4)
        this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes (- 4);
}



 

private void dateTimePicker1_ValueChanged(object sender, EventArgs e) {
	    switch (this.dateTimePicker1.Value.Minute % 5) {
		case 1:
		    this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes(4);
		    break;
		case 4:
		    this.dateTimePicker1.Value = this.dateTimePicker1.Value.AddMinutes(-4);
		    break;
	    }
}


