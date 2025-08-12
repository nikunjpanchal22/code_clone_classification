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
        size_t len = strlen(argv[i]) + 1;
        myargv[i - 1] = malloc(len);
        strncpy(myargv[i - 1], argv[i], len);
    }
    getch(); 
}


