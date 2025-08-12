protected void button1_Click (object sender, EventArgs e) {
    int safelyConvertedValue = - 1;
    if (! System.Int32.TryParse (textBox1.Text, out safelyConvertedValue)) {
        MessageBox.Show ("You need to enter a number between 1 an 9");
        return;
    }
    if (safelyConvertedValue < 0 || safelyConvertedValue > 9) {
        MessageBox.Show ("You need to enter a number between 1 an 9");
        return;
    }
    MyProcessor p = new MyProcessor ();
    textBox1.Text = p.AddTen (safelyConvertedValue).ToString ();
}




protected void button1_Click(object sender, EventArgs e)
{
    bool isValid = Int32.TryParse(textBox1.Text, out int x) && x <= 9 && x >= 1;
    textBox1.Text = isValid ? new MyProcessor().AddTen(x).ToString() : "You need to enter a number between 1 and 9";
    if (!isValid)
        MessageBox.Show(textBox1.Text);
}


