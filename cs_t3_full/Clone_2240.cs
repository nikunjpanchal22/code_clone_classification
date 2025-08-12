private void button1_Click (object sender, EventArgs e) {
    textBox2.Clear ();
    try {
        float v = float.Parse (textBox1.Text);
        textBox2.AppendText ((Math.Sin (v)).ToString ());
    }
    catch {
        textBox2.Clear ();
        textBox2.AppendText ("Invalid Input");
    }
}





private void button1_Click (object sender, EventArgs e)
{
    textBox2.Clear();
    bool isValid = double.TryParse(textBox1.Text, out double v);
    if(isValid)
        textBox2.AppendText((Math.Sin(v)).ToString());
    else {
        textBox2.Clear();
        textBox2.AppendText("Invalid Input");
    }
}


