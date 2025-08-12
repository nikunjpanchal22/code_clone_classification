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
		    var value = IsValidValue(textBox1.Text);
		    if (value.HasValue)
		    {
			textBox1.Text = new MyProcessor().AddTen(value.Value).ToString();
		    }
		    else
		    {
			MessageBox.Show("You need to enter a number between 1 and 9");
		    }
		}

		private int? IsValidValue(string text)
		{
		    if (!int.TryParse(text, out var value) || value < 1 || value > 9)
		    {
			return null;
		    }

		    return value;
}


