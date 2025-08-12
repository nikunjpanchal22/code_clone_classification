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


	private void txt_miktar_TextChanged (object sender, TextChangedEventArgs e) {
    var tb = (sender as TextBox);
    if (string.IsNullOrWhiteSpace (tb.Text)) {
        return;
    }

    int adet;
    if (!int.TryParse (tb.Text, out adet) || adet < 0) {
        tb.Text = tb.Text.Substring (0, tb.Text.Length - 1);
        tb.Select (tb.Text.Length, tb.Text.Length);
    }
}


