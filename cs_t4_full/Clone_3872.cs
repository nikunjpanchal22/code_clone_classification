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
    Array.ForEach(TextBoxes, tbxName => this.Controls.Find($"txt{tbxName}", true).FirstOrDefault() as TextBox).ToList().ForEach(t => t.Text = string.Empty);
}


