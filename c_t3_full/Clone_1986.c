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
    char *lastName = calloc(101, sizeof(char));
    char *firstName = calloc(101, sizeof(char));
    char *depart = calloc(101, sizeof(char));
    char *arrive = calloc(101, sizeof(char));
    printf ("Please enter passenger's last name: ");
    scanf ("%100s", lastName);
    printf ("Please enter passenger's first name: ");
    scanf ("%100s", firstName);
    printf ("Which airport are you departing from? ");
    scanf ("%100s", depart);
    printf ("Which airport will you be heading to? ");
    scanf ("%100s", arrive);
    printf ("LAST NAME: %s FIRST NAME: %s FROM: %s TO: %s\n", lastName, firstName, depart, arrive);
    free(lastName);
    free(firstName);
    free(depart);
    free(arrive);
    return 0;
}


