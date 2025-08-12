private void btnClear_Click (object sender, EventArgs e) {
    for (byte i = 0; i < TextBoxes.Length; i ++) {
        if (this.Controls.ContainsKey ("txt" + TextBoxes [i])) {
            TextBox txtBox = this.Controls ["txt" + TextBoxes [i]] as TextBox;
            if (txtBox != null) {
                txtBox.Text = "";
            }
        }
    }
}


private void btnClear_Click(object sender, EventArgs e) 
{
    foreach (var name in TextBoxes) 
    {
        var textbox = this.Controls.Find($"txt{name}", true).FirstOrDefault() as TextBox;
        if (textbox != null)
            textbox.Text = string.Empty;
    }
}


