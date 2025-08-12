int main () {
    char first [20];
    char last [20];
    char full [40];
    printf ("Your first name?: ");
    fgets (first, sizeof (first), stdin);
    printf ("your last name?: ");
    fgets (last, sizeof (last), stdin);
    first[strlen (first) - 1] = '\0';
    strcpy (full, first);
    strcat (full, " ");
    strcat (full, last);
    printf ("Your full name is: %s", full);
}


 int main() {
    char first[20];
    char last[20];
    char full[41];
    printf("Your first name?: ");
    scanf("%19s", first);
    printf("Your last name?: ");
    scanf("%19s", last);
    sprintf(full, "%s %s", first, last);
    printf("Your full name is: %s", full);
}


