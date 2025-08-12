int main (void) {
    char username [16];
    char text [512];
    int ch, i;
    FILE *my_file = fopen ("inbox.txt", "r");
    while (1 == fscanf (my_file, "%15s%*c", username)) {
        i = 0;
        while (i < sizeof (text) - 1 && EOF != (ch = fgetc (my_file))) {
            if (ch == '\n' && i && text[i - 1] == '\n')
                break;
            text[i++] = ch;
        }
        text[i] = 0;
        printf ("user:%s\n", username);
        printf ("text:\n%s\n", text);
    }
    fclose (my_file);
    return 0;
}


int main (void) {
    char username [16];
    char text [512];
    int ch, i;
    FILE *my_file = fopen ("inbox.txt", "r");
    while (1 == fscanf (my_file, "%15s%*c", username)) {
        i = 0;
        while (i < sizeof (text) - 1 && EOF != (ch = fgetc (my_file))) {
            if (ch == '\n' && i && text[i] == '\n')
                break;
            text[i] = ch;
            i++;
        }
        text[i] = '\0';
        printf ("user: %s\n", username);
        printf ("text: \n%s\n", text);
    }
    fclose (my_file);
    return 0;
}
