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


  private void MainForm_KeyDown (object sender, KeyEventArgs e) {
        if (e.KeyCode.Equals(Keys.Enter))
        {
            if (String.IsNullOrWhiteSpace(txtUserName.Text))
            {
                txtUserName.Focus();
            }
            else
            {
                if (txtUserName.Focused)
                {
                    foreach (string source in txtUserName.AutoCompleteCustomSource)
                    {
                        if (source.Equals(txtUserName.Text, StringComparison.OrdinalIgnoreCase))
                        {
                            txtUserName.Text = source;
                            txtPassword.Focus();
                            return;
                        }
                    }
                }

                if  (String.IsNullOrWhiteSpace(txtPassword.Text))
                {
                    txtPassword.Focus();
                }
                else
                {
                    btnLogin_Click(null, null);
                }
            }
        }
    }

 private void mainForm_KeyDown (object sender, KeyEventArgs e) {
    if (e.KeyCode.Equals (Keys.Enter)) {
        if (txtUserName.Text.Length > 0) {
            if (txtUserName.Focused) {
                bool foundSource = false;
                for (int i = 0; i < txtUserName.AutoCompleteCustomSource.Count; i ++) {
                    if (String.Compare(txtUserName.Text, txtUserName.AutoCompleteCustomSource[i], true) == 0) {
                        txtUserName.Text = txtUserName.AutoCompleteCustomSource[i];
                        txtPassword.Focus();
                        foundSource = true;
                        break;
                    }
                }
                // If the Autocomplete source was found, exit the method
                if(foundSource) {
                    return;
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


