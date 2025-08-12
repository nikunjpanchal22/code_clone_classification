private void btnAddDriver_Click (object sender, RoutedEventArgs e) {
    decimal policy = 500M;
    decimal Chauffeur = 0.10M;
    decimal Accountant = 0.10M;
    decimal age2125 = 0.20M;
    decimal age2675 = 0.10M;
    if (cmbOccupation.SelectedItem.ToString () == Occumpation.Chauffeur.ToString ()) {
        policy += policy * Chauffeur;
    } else if (cmbOccupation.SelectedItem.ToString () == Occumpation.Accountant.ToString ()) {
        policy -= policy * Accountant;
    }
    DateTime ? birthDate = dpkDOB.SelectedDate;
    if (birthDate != null) {
        if (birthDate.Age ().Years () > 21 && birthDate.Age ().Years () < 26) {
            policy += policy * age2125;
        } else if (birthDate.Age ().Years () > 26 && birthDate.Age ().Years () < 76) {
            policy -= policy * age2675;
        }
    }
    txtPolicy.Text = policy.ToString ();
}


 private void btnAddDriver_Click (object sender, RoutedEventArgs e) {
    decimal policy = 500M;
    decimal age2125 = 0.20M;
    decimal age2675 = 0.10M;
    switch (cmbOccupation.SelectedIndex) {
        case (int) Occumpation.Chauffeur:
            policy += policy * 0.10M;
            break;
        case (int) Occumpation.Accountant:
            policy -= policy * 0.10M;
            break;
    }
    DateTime ? birthDate = dpkDOB.SelectedDate;
    if (birthDate != null) {
        int age = DateTime.Now.Year - birthDate.Value.Year;
        if (age >= 21 && age <= 25) {
            policy += policy * age2125;
        } else if (age >= 26 && age <= 75) {
            policy -= policy * age2675;
        }
    }
    txtPolicy.Text = policy.ToString();
}


