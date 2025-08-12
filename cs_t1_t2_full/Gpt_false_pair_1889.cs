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
    if ((sender as TextBox).Text.Length < 1) {
        return;
    }
    try {
        int num = Convert.ToInt32 ((sender as TextBox).Text);
    }
    catch (Exception) {
        string str = "";
        str = (sender as TextBox).Text;
        str = str.Substring (0, str.Length - 1);
        (sender as TextBox).Text = str;
        (sender as TextBox).Select (str.Length, str.Length);
    }
}
