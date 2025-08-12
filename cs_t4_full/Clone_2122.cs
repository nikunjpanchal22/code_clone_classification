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
    if(int.TryParse(textBox1.Text, out int x))
    {
        if(x >= 1 && x <= 9)
        {
            textBox1.Text = new MyProcessor().AddTen(x).ToString();
        }
        else
        {
            MessageBox.Show("You need to enter a number between 1 and 9");
        }
    }
    else
    {
        MessageBox.Show("You need to enter a number between 1 and 9");
    }
}


