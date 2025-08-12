int main (void) {
    char one [30];
    char two [30];
    while (fgets (one, sizeof (one), stdin)) {
        int len = strlen (one);
        for (int i = 0; i < (len + 1); i++) {
            two[i] = one[i];
        }
        printf ("%s", two);
        break;
    }
    return EXIT_SUCCESS;
}


 int main (void) {
    char one [30];
    char two [30];
    while (fgets (one, sizeof (one), stdin)) {
            strcpy(two, one);
            printf ("%s", two);
            break;
    }
    return EXIT_SUCCESS;
}


