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
    int i; 
    for (i=0; i<TextBoxes.Length; ) 
    { 
        if (this.Controls.ContainsKey("txt" + TextBoxes[i])) 
        { 
            TextBox txtBox = this.Controls["txt" + TextBoxes[i]] as TextBox; 
            if (txtBox != null) 
            { 
                txtBox.Text = string.Empty; 
            } 
            i++; 
        } 
    } 
} 


