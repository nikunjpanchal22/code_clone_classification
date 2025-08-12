int main () {
    char *msg [100];
    char temp [100];
    int length, i;
    int num = 0;
    while ((scanf ("%s", &temp[0]) != EOF)) {
        length = strlen (temp);
        msg[num] = malloc ((length + 1) * sizeof (char));
        strcpy (msg [num], temp);
        num++;
    }
    printf ("There are %d words in the this input.\n", num);
    for (i = 0; i < num; i++) {
        printf ("%s\n", msg [i]);
    }
    return 0;
}


int main () {
    char *msg [100];
    char temp [100];
    int length, i;
    int num = 0;
    while ((scanf ("%s", &temp[0]) != EOF)) {
        length = strlen (temp);
        msg[num] = malloc ((length + 1) * sizeof (char));
        strcpy (msg [num], temp);
        num++;
    }
    printf ("Number of entered words: %d\n", num);
    for (i = 0; i < num; i++) {
        printf ("word number %d: %s\n", i + 1, msg [i]);
    }
    return 0;
}
