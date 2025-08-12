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
    printf ("Please enter passenger's last name: ");
    char *lastNamePtr = fgets(lastName, sizeof(lastName), stdin);
    printf ("Please enter passenger's first name: ");
    char *firstNamePtr = fgets(firstName, sizeof(firstName), stdin);
    printf ("Which airport are you departing from? ");
    char *departPtr = fgets(depart, sizeof(depart), stdin);
    printf ("Which airport will you be heading to? ");
    char *arrivePtr = fgets(arrive, sizeof(arrive), stdin);
    printf ("LAST NAME: %s FIRST NAME: %s FROM: %s TO: %s\n", lastNamePtr, firstNamePtr, departPtr, arrivePtr);
    return 0;
}


