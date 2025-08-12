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


 private void txt_miktar_TextChanged(object sender, TextChangedEventArgs e)
{
    if (!(sender is TextBox))
        return;

    TextBox textbox = sender as TextBox;
    if (textbox.Text.Length < 1)
        return;

    int adet = 0;
    if (!int.TryParse(textbox.Text, out adet))
    {
        string s = "";
        s = textbox.Text;
        s = s.Substring(0, s.Length - 1);
        textbox.Text = s;
        textbox.Select(s.Length, s.Length);
    }
}


