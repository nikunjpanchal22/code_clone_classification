private void addPersonButtonActionPerformed (java.awt.event.ActionEvent evt) {
    String firstName = firstNameTextField.getText ();
    String lastName = lastNameTextField.getText ();
    String emailAddress = emailTextField.getText ();
    boolean valid = true;
    if (firstName.equals ("")) {
        System.out.println ("First Name is missing");
        valid = false;
    }
    if (lastName.equals ("")) {
        System.out.println ("Last Name is missing");
        valid = false;
    }
    if (emailAddress.equals ("")) {
        System.out.println ("E-Mail address is missing");
        valid = false;
    }
    if (! Email.isValid (emailAddress)) {
        System.out.println ("E-Mail address is invalid");
        valid = false;
    }
    if (valid) {
        personArrayList.add (new Person (firstName, lastName, emailAddress));
        System.out.println ("Person added!");
    }
}


private void addPersonButtonActionPerformed (java.awt.event.ActionEvent evt) {
    String firstNameText = firstNameTextField.getText ();
    String lastNameText = lastNameTextField.getText ();
    String emailAddressText = emailTextField.getText ();
    boolean verdict = true;
    if (firstNameText.equals ("")) {
        System.out.println ("First Name is not provided");
        verdict = false;
    }
    if (lastNameText.equals ("")) {
        System.out.println ("Last Name is not provided");
        verdict = false;
    }
    if (emailAddressText.equals ("")) {
        System.out.println ("E-Mail address not entered");
        verdict = false;
    }
    if (! Email.isValid (emailAddressText)) {
        System.out.println ("E-Mail address is invalid");
        verdict = false;
    }
    if (verdict) {
        personArrayList.add (new Person (firstNameText, lastNameText, emailAddressText));
        System.out.println ("Person has been successfully added!");
    }
}
