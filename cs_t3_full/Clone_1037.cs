private void button1_Click (object sender, EventArgs e) {
    textBox2.Clear ();
    float result;
    if (float.TryParse (textBox1.Text, out result)) {
        textBox2.AppendText (Math.Sin (result).ToString ());
    } else {
        textBox2.Text = "Invalid Input";
    }
}


  private void button1_Click (object sender, EventArgs e) {
    textBox2.Clear ();
    decimal result;
    if (decimal.TryParse (textBox1.Text, out result)) {
        textBox2.AppendText (Math.Sin (Convert.ToDouble (result)).ToString ());
    } else {
        textBox2.Text = "Invalid Input";
    }
}


