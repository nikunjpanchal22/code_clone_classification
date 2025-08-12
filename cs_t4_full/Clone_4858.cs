private void txt_miktar_TextChanged (object sender, TextChangedEventArgs e) {
    if ((sender as TextBox).Text.Length < 1) {
        return;
    }
    try {
        int adet = Convert.ToInt32 ((sender as TextBox).Text);
    }
    catch {
        string s = "";
        s = (sender as TextBox).Text;
        s = s.Substring (0, s.Length - 1);
        (sender as TextBox).Text = s;
        (sender as TextBox).Select (s.Length, s.Length);
    }
}


private void txt_miktar_TextChanged (object sender, TextChangedEventArgs e) 
{ 
    if (sender is TextBox textBox && textBox.Text.Length > 0) 
    { 
        try 
        { 
            int adet = Convert.ToInt32(textBox.Text); 
        } 
        catch 
        { 
            string s = ""; 
            s = textBox.Text; 
            s = s.Substring(0, s.Length - 1); 
            textBox.Text = s; 
            textBox.Select(s.Length, s.Length); 
        } 
    } 
}


