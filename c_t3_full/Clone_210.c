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
    GString *gString = g_string_new (str);
    for (int i = 0; i < 5; i++) {
        n_oframe[i] = (gint16) g_ascii_strtoull(gString->str, NULL, 10);
        gString = g_string_erase(gString, 0, g_utf8_strlen (n_oframe[i], -1));
    }
    printf ("n_oframe: ");
    for (int i = 0; i < 5; i++) {
        printf ("%d, ", n_oframe [i]);
    }
    printf ("\n");
    g_string_free (gString, TRUE);
    free (str);
    return 0;
}


