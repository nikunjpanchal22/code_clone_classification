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
        int i, j;
        for (i = 0, j = strlen(one) - 1; j >= 0; i++, j--){
            two[i] = one[j];
        } two[i] = '\0';
        printf ("%s", two);
        break;
    }
    return EXIT_SUCCESS;
}


