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


private void txt_miktar_TextChanged (object send, TextChangedEventArgs e)
{
    if (send is TextBox t && t.Text.Length > 0)
    {
        int adet;
        if (!int.TryParse(t.Text, out adet))
        {
            string s = t.Text.Substring(0, t.Text.Length - 1);
            t.Text = s;
            t.Select(s.Length, s.Length);
        }
    }
}


