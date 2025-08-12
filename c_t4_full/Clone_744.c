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
     char **myargv = (char**)malloc((argc - 1) * sizeof(char*));
     int myargc;
     for(myargc = 0; myargc < argc-1; myargc++){
         myargv[myargc] = (char*)malloc(strlen(argv[myargc+1]) +1);
         memcpy(myargv[myargc], argv[myargc+1], strlen(argv[myargc+1]) +1);
     }
     getch ();
     // Free arrays
    for (int i=0; i < myargc; ++i){
        free(myargv[i]);
    }
    free(myargv);
}


