int main (void) {
    gint16 frame [5] = {10, 2, 3, 7, 5};
    char *str = gint16_to_string (frame, 5);
    printf ("encoded string: %s\n", str);
    gint16 n_oframe [5];
    string_to_gint16 (n_oframe, 5, str);
    printf ("n_oframe: ");
    for (int i = 0; i < 5; i++) {
        printf ("%d, ", n_oframe [i]);
    }
    printf ("\n");
    free (str);
    return 0;
}


 int main (void) {
    gint16 frame [5] = {10, 2, 3, 7, 5};
    char *str = gint16_to_string (frame, 5);
    printf ("encoded string: %s\n", str);
    gint16 n_oframe [5];
    int multiplier = 1;
    int j = 0;
    for (int i = 0; i < strlen(str); i++) {
        if (str[i] == ',' || str[i] == ' '){
            j++;
            multiplier = 1;
        } else {
            n_oframe[j] = n_oframe[j] + (str[i] - '0')  * multiplier;
            multiplier *= 10;
        }
    }
    printf ("n_oframe: ");
    for (int i = 0; i < 5; i++) {
        printf ("%d, ", n_oframe [i]);
    }
    printf ("\n");
    free (str);
    return 0;
}


