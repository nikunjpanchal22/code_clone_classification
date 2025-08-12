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
        if (e.KeyCode.Equals(Keys.Enter))
        {
            if (txtUserName.Text.Length > 0)
            {
                if (txtUserName.Focused)
                {
                    bool upperCaseMatch = false;
                    foreach (string source in txtUserName.AutoCompleteCustomSource)
                    {
                        if (source.ToUpperInvariant().Equals(txtUserName.Text.ToUpperInvariant()))
                        {
                            txtUserName.Text = source;
                            txtPassword.Focus();
                            upperCaseMatch = true;
                            break;
                        }
                    }
                    if (upperCaseMatch)
                    {
                        return;
                    }
                }
                if (String.IsNullOrWhiteSpace(txtPassword.Text))
                {
                    txtPassword.Focus();
                }
                else
                {
                    btnLogin_Click(null, null);
                }
            }
            else
            {
                txtUserName.Focus();
            }
        }
    }
    
    
 private void MainForm_KeyDown (object sender, KeyEventArgs e) {
        if (e.KeyCode.Equals(Keys.Enter))
        {
            if (String.IsNullOrEmpty(txtUserName.Text))
            {
                txtUserName.Focus();
            }
            else
            {
                if (txtUserName.Focused)
                {
                    foreach (string source in txtUserName.AutoCompleteCustomSource)
                    {
                        if (String.Equals(source, txtUserName.Text, StringComparison.OrdinalIgnoreCase))
                        {
                            txtUserName.Text = source;
                            txtPassword.Focus();
                            return;
                        }
                    }
                }

                if  (String.IsNullOrEmpty(txtPassword.Text))
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
                for (int i = 0; i < txtUserName.AutoCompleteCustomSource.Count; i ++) {
                    if (txtUserName.Text.ToLower() == txtUserName.AutoCompleteCustomSource[i].ToLower()) {
                        txtUserName.Text = txtUserName.AutoCompleteCustomSource[i];
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


