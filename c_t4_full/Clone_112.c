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
make
gint16 frame [5] = {10, 2, 3, 7, 5};
    char *str = gint16_to_string (frame, 5);
    printf ("encoded string: %s\n", str);
    GString *buffer = g_string_new (str);
    gint16 n_oframe [5];
    for (int i = 0; i < 5; i++) {
        const gchar *str_in_buffer = g_strstr_len (buffer->str, buffer->len, ",");
        if (str_in_buffer == NULL) {
            n_oframe[i] = (gint16) g_ascii_strtoull(buffer->str, NULL, 10);
            buffer = g_string_erase (buffer, 0, -1);
        } else {
            n_oframe[i] = (gint16) g_ascii_strtoull(buffer->str, NULL, 10);
            buffer = g_string_erase (buffer, 0, g_utf8_strlen (str_in_buffer, -1));
        }
    }
    printf ("n_oframe: ");
    for (int i = 0; i < 5; i++) {
        printf ("%d, ", n_oframe [i]);
    }
    printf ("\n");
    g_string_free (buffer, TRUE);
    free (str);
    return 0;
}


