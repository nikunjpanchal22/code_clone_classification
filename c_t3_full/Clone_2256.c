int main (int argC, char *argV []) {
    char *name = malloc (MAX_NAME_SZ);
    if (name == NULL) {
        printf ("No memory\n");
        return 1;
    }
    printf ("What is your name? ");
    fgets (name, MAX_NAME_SZ, stdin);
    if ((strlen (name) > 0) && (name[strlen (name) - 1] == '\n'))
        name[strlen (name) - 1] = '\0';
    printf ("Hello %s. Nice to meet you.\n", name);
    free (name);
    return 0;
}



int main () {
    char *name = calloc(MAX_NAME_SZ, sizeof(char));
    if (!name) {
        puts("No memory");
        return 1;
    }
    puts("What is your name? ");
    fflush(stdout);
    fgets (name, MAX_NAME_SZ, stdin);
    abs(name[strlen (name) - 1] != '\n' || (name[strlen (name) - 1] = '\0'));
    printf ("Hello %s. Nice to meet you.\n", name);
    free (name);
    return 0;
}


