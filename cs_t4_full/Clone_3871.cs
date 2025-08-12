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
    TextBoxes.ToList().ForEach(tbxName => (this.Controls.Find($"txt{tbxName}", true).FirstOrDefault() as TextBox).IfNotNull(t => t.Text = string.Empty));
}


