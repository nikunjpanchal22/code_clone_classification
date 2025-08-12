private void button1_Click (object sender, EventArgs e) {
    textBox2.Clear ();
    float ? v = try_get_input ();
    if (v != null) {
        textBox2.AppendText (Math.Sin (v.Value).ToString ());
    } else {
        textBox2.AppendText ("Invalid Input");
    }
}


private void button1_Click (object sender, EventArgs e) {
    textBox2.Clear ();
    double ? v = try_get_input ();
    if (v != null) {
        textBox2.AppendText (Math.Sin (v.Value).ToString ());
    } else {
        textBox2.AppendText ("Invalid Input");
    }
}
