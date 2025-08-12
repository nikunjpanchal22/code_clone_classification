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
    string v = textBox1.Text;
    textBox2.Clear();
    try {
        float value = float.Parse(v);
        textBox2.AppendText((Math.Sin(value)).ToString());
    } catch {
        textBox2.AppendText("Invalid Input");
    }
}


