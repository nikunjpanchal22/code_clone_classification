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
    if (!(sender is TextBox box) || string.IsNullOrEmpty(box.Text) || int.TryParse(box.Text, out _)) return;
    box.Text = box.Text.TrimEnd(box.Text[^1]);
    box.Select(box.Text.Length, box.Text.Length);
}


