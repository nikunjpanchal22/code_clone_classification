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


 void addPersonButtonActionPerformed (java.awt.event.ActionEvent evt) {
    boolean valid = true;
    String firstName = firstNameTextField.getText();
    if (firstName.equals("")) {
        System.out.println("First Name is missing");
        valid = false;
    }
    String lastName = lastNameTextField.getText();
    if (lastName.equals("")) {
        System.out.println("Last Name is missing");
        valid = false;
    }
    String emailAddress = emailTextField.getText();
    if (emailAddress.equals("")) {
        System.out.println("E-Mail address is missing");
        valid = false;
    }
    if (!Email.isValid(emailAddress)) {
        System.out.println("E-Mail address is invalid");
        valid = false;
    }
    if (valid) {
        personArrayList.add(new Person(firstName, lastName, emailAddress));
        System.out.println("Person added!");
    }
}
