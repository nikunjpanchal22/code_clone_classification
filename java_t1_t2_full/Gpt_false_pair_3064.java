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
    String firstN = firstNameTextField.getText ();
    String lastN = lastNameTextField.getText ();
    String email = emailTextField.getText ();
    boolean isValid = true;
    if (firstN.equals ("")) {
        System.out.println ("First Name empty");
        isValid = false;
    }
    if (lastN.equals ("")) {
        System.out.println ("Last Name empty");
        isValid = false;
    }
    if (email.equals ("")) {
        System.out.println ("E-Mail is missing");
        isValid = false;
    }
    if (! Email.isValid (email)) {
        System.out.println ("E-Mail invalid");
        isValid = false;
    }
    if (isValid) {
        personArrayList.add (new Person (firstN, lastN, email));
        System.out.println ("Person added successfully!");
    }
}
