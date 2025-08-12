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
    char *p;
    p = str;
    const char *search = ",";
    char *last_delimiter;
    for (int i = 0; i < 5; i++) {
        last_delimiter = strstr(p, search);
        if (last_delimiter == NULL) 
            last_delimiter = p + strlen(p);
        n_oframe[i] = (gint16) strtol(p, &p, 10);
        p = last_delimiter + 1;
    }
    printf ("n_oframe: ");
    for (int i = 0; i < 5; i++) {
        printf ("%d, ", n_oframe [i]);
    }
    printf ("\n");
    free (str);
    return 0;
}


