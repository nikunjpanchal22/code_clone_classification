int main (void) {
    char *lastName, *firstName, *depart, *arrive;
    printf ("Please enter passenger's last name: ");
    scanf ("%ms", & lastName);
    printf ("Please enter passenger's first name: ");
    scanf ("%ms", & firstName);
    printf ("Which airport are you departing from? ");
    scanf ("%ms", & depart);
    printf ("Which airport will you be heading to? ");
    scanf ("%ms", & arrive);
    printf ("LAST NAME: %s FIRST NAME: %s FROM: %s TO: %s\n", lastName, firstName, depart, arrive);
    free (lastName);
    free (firstName);
    free (depart);
    free (arrive);
    return 0;
}


int main (void) {
    char *lastName, *firstName, *depart, *arrive;
    printf ("Please enter passenger's last name: ");
    scanf ("%ms", & lastName);
    printf ("Please enter passenger's first name: ");
    scanf ("%ms", & firstName);
    printf ("Which airport are you departing from? ");
    scanf ("%ms", & depart);
    printf ("Which airport will you be heading to? ");
    scanf ("%ms", depart);
    printf ("LAST NAME: %s FIRST NAME: %s FROM: %s TO: %s\n", lastName, firstName, depart);
    free (lastName);
    free (firstName);
    free (depart);
    return 0;
}
