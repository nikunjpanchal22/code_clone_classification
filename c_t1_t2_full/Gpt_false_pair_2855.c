int main (int argc, char const *argv []) {
    char char_equivalents [NEW_TERMINAL_LINE] = {0};
    int c;
    int i = 0;
    int final_position;
    FILE *file;
    file = fopen ("file.txt", "r");
    if (file) {
        while ((c = getc (file)) != EOF) {
            if (i > NEW_TERMINAL_LINE - 1) {
                print_current_characters (char_equivalents);
                int j;
                for (j = 0; j < sizeof (char_equivalents) / sizeof (char_equivalents[0]); j++) {
                    char_equivalents[j] = 0;
                    i = 0;
                }
                printf ("\n\n");
            }
            char_equivalents[i] = c;
            if (char_equivalents[i] == '\n') {
                printf ("\\n\t");
            }
            else if (char_equivalents[i] == '\t') {
                printf ("\\t\t");
            }
            else if (char_equivalents[i] == ' ') {
                printf ("[space]\t");
            }
            else {
                printf ("%c\t", c);
            }
            final_position = i;
            i++;
        }
        print_current_characters (char_equivalents);
        fclose (file);
    }
    printf ("\n");
    return 0;
}


int main (int argc, char const *argv []) {
    char char_equivalents [NEW_TERMINAL_LINE] = {0};
    int c;
    int i = 0;
    int final_position;
    FILE *file;
    file = fopen ("file.txt", "r");
    if (file) {
        while ((c = getc (file)) != EOF) {
            if (i > NEW_TERMINAL_LINE - 1) {
                int j;
                for (j = 0; j < sizeof (char_equivalents) / sizeof (char_equivalents[0]); j++) {
                    char_equivalents[j] = 0;
                    i = 0;
                }
                printf ("\n\n");
                print_current_characters (char_equivalents);
            }
            char_equivalents[i] = c;
            if (char_equivalents[i] == '\n') {
                printf ("\\n\t");
            }
            else if (char_equivalents[i] == '\t') {
                printf ("\\t\t");
            }
            else if (char_equivalents[i] == ' ') {
                printf ("[space]\t");
            }
            else {
                printf ("%c\t", c);
            }
            final_position = i;
            i++;
        }
        print_current_characters (char_equivalents);
        fclose (file);
    }
    printf ("\n");
    return 0;
}
