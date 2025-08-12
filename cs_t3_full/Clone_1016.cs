private void btnAddDriver_Click (object sender, RoutedEventArgs e) {
    double tempPolicy = policy;
    if (cmbOccupation.SelectedItem.ToString () == Occumpation.Chauffeur.ToString ()) {
        tempPolicy = (tempPolicy + tempPolicy * Chauffeur);
        txtPolicy.Text = tempPolicy.ToString ();
    } else if (cmbOccupation.SelectedItem.ToString () == Occumpation.Accountant.ToString ()) {
        tempPolicy = (tempPolicy - tempPolicy * Accountant);
        txtPolicy.Text = tempPolicy.ToString ();
    }
    DateTime birthDate = Convert.ToDateTime (dpkDOB.SelectedDate);
    if (birthDate.Age ().Years () > 21 && birthDate.Age ().Years () < 26) {
        tempPolicy = (tempPolicy + tempPolicy * age2125);
        txtPolicy.Text = tempPolicy.ToString ();
    } else if (birthDate.Age ().Years () > 26 && birthDate.Age ().Years () < 76) {
        tempPolicy = (tempPolicy - tempPolicy * age2675);
        txtPolicy.Text = tempPolicy.ToString ();
    }
}


  private void btnAddDriver_Click (object sender, RoutedEventArgs e) {
    double tempPolicy = policy;
    if (cmbOccupation.SelectedValue == Occumpation.Chauffeur) {
        tempPolicy = (tempPolicy + tempPolicy * Chauffeur);
        txtPolicy.Text = tempPolicy.ToString ();
    } else if (cmbOccupation.SelectedValue == Occumpation.Accountant) {
        tempPolicy = (tempPolicy - tempPolicy * Accountant);
        txtPolicy.Text = tempPolicy.ToString ();
    }
    var ageInYears = DateTime.Today.Year - dpkDOB.SelectedDate.Year;
    if (ageInYears > 21 && ageInYears < 26) {
        tempPolicy = (tempPolicy + tempPolicy * age2125);
        txtPolicy.Text = tempPolicy.ToString ();
    } else if (ageInYears > 26 && ageInYears < 76) {
        tempPolicy = (tempPolicy - tempPolicy * age2675);
        txtPolicy.Text = tempPolicy.ToString ();
    }
}


