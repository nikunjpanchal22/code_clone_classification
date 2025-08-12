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
    foreach (string i in TextBoxes)
    {
        if (this.Controls.ContainsKey("txt" + i))
        {
            TextBox txtBox = this.Controls["txt" + i] as TextBox;
            if (txtBox != null)
            {
                txtBox.Text = "";
            }
        }
    }
}


