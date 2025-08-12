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
    try {
        personArrayList.add(makePerson());
        System.out.println("Person added!");
    } catch (InvalidEmailException e) {
        System.out.println("E-Mail address is invalid: " + e.getMessage());
    } catch (MissingInformationException e) {
        System.out.println("Missing information: " + e.getMessage());
    }
}


