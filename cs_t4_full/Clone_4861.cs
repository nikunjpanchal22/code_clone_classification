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
    if (sender is TextBox textbox && textbox.Text.Length > 0) 
    { 
        int adet = Convert.ToInt32(textbox.Text); 
        if (adet == 0)
        { 
            string s = ""; 
            s = textbox.Text; 
            s = s.Substring(0, s.Length - 1); 
            textbox.Text = s;
            textbox.Select(s.Length, s.Length); 
        } 
    } 
}


