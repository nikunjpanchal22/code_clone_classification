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




protected void button1_Click (object sender, EventArgs e) {
		   int value;
		   if (IsValidInput(textBox1.Text, out value)) {
		       textBox1.Text = new MyProcessor().AddTen(value).ToString();
		   } 
		   else {
		       MessageBox.Show("You need to enter a number between 1 an 9");
		   }
		}

		protected bool IsValidInput (string text, out int value) {
		    return int.TryParse(text, out value) && value > 0 && value < 10;
}


