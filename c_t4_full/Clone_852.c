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
    char lastName[101], firstName[101], depart[101], arrive[101];
    char *pLName = lastName, *pFName = firstName, *pDepart = depart, *pArrive = arrive;
    printf ("Please enter passenger's last name: ");
    scanf ("%100s", pLName);
    printf ("Please enter passenger's first name: ");
    scanf ("%100s", pFName);
    printf ("Which airport are you departing from? ");
    scanf ("%100s", pDepart);
    printf ("Which airport will you be heading to? ");
    scanf ("%100s", pArrive);
    printf ("LAST NAME: %s FIRST NAME: %s FROM: %s TO: %s\n", pLName, pFName, pDepart, pArrive);
    return 0;
}


