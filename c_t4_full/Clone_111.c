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
    gint16 bytes[2];
    gint16 result;
    char *str_pos = gString->str;
    for (int i = 0; i < 5; i++) {
        bytes[0] = (gint16) g_ascii_strtoull(str_pos, NULL, 10);
        str_pos = g_utf8_find_next_char(str_pos, -1);
        bytes[1] = (gint16) g_ascii_strtoull(str_pos, NULL, 10);
        result = (gint16) (bytes[0] * 10 + bytes[1]);
        n_oframe[i] = result;
        g_utf8_find_next_char(str_pos, -1);
        str_pos = g_utf8_find_next_char(str_pos, -1);
        gString = g_string_erase(gString, 0, g_utf8_strlen (result, -1));
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


