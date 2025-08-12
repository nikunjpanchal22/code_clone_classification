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





int main (void) {
    char *name = malloc(MAX_NAME_SZ * sizeof(char));
    if(name == NULL){
        fprintf(stderr, "No memory\n");
        return 1;
    }
    printf("What is your name? ");
    fgets(name, MAX_NAME_SZ, stdin);
    name[MAX_NAME_SZ] = '\0'; 
    printf("Hello %s. Nice to meet you.\n", name);
    free(name);
    return 0;
}


