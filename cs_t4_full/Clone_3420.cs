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



private void button1_Click(object sender, EventArgs e)
{
    textBox2.Text = "";
    try {
        double v = double.Parse(textBox1.Text);
        textBox2.Text = Math.Sin(v).ToString();
    }
    catch {
        textBox2.Text = "Invalid Input";
    }
}


