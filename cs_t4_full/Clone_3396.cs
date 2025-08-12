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
    TextBox box = sender as TextBox;
    if (box != null && box.Text.Length > 0 && !int.TryParse(box.Text, out _))
    {
        box.Text = box.Text.Remove(box.Text.Length - 1, 1);
        box.SelectionStart = box.Text.Length;
    }
}


