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
    TextBoxes.Select(tb => this.Controls[$"txt{tb}"] as TextBox)
             .Where(tb => tb != null)
             .ToList()
             .ForEach(tb => tb.Text = string.Empty);
}


