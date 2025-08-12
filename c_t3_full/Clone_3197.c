void main (int argc, char **argv) {
    int myargc = argc;
    char **myargv = malloc ((argc - 1) * sizeof (void *));
    int i;
    for (i = 1; i < argc; i++) {
        int len = strlen (argv[i]);
        myargv[i - 1] = malloc (len +1);
        memcpy (myargv [i - 1], argv [i], len + 1);
    }
    getch ();
}





void main (int argc, char **argv) { 
    int myargc = argc; 
    char **myargv = malloc((argc - 1) * sizeof(char*)); 
    int i;
    for (i = 1; i < argc; i++) {
        myargv[i - 1] = (char*) calloc((strlen(argv[i]) + 1), sizeof(char)); 
        strncpy(myargv[i - 1], argv[i], strlen(argv[i]) + 1); 
    }
    getch(); 
}


