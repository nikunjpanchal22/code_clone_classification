private void mainForm_KeyDown (object sender, KeyEventArgs e) {
    if (e.KeyCode.Equals (Keys.Enter)) {
        if (txtUserName.Text.Length > 0) {
            if (txtUserName.Focused) {
                Regex rg = new Regex (txtUserName.Text, RegexOptions.IgnoreCase);
                for (int i = 0; i < txtUserName.AutoCompleteCustomSource.Count; i ++) {
                    if (rg.IsMatch (txtUserName.AutoCompleteCustomSource [i])) {
                        txtUserName.Text = txtUserName.AutoCompleteCustomSource [i];
                        txtPassword.Focus ();
                        return;
                    }
                }
            }
            if (txtPassword.Text.Length > 0) {
                btnLogin_Click (null, null);
            } else {
                txtPassword.Focus ();
            }
        } else {
            txtUserName.Focus ();
        }
    }
}





private void mainForm_KeyDown(object sender, KeyEventArgs e)
{
    if (e.KeyCode == Keys.Enter) {
        if (IsNotEmpty(txtUserName)) {
            if (txtUserName.Focused) {
                AutoCompleteCheck(txtUserName);
                txtPassword.Focus();
                return;
            }
            ProceedWithLogin(txtPassword, btnLogin_Click);
        } else {
            txtUserName.Focus();
        }
    }
}


