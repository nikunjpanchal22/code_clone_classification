int main (int argc, char *argv []) {
    char *toParseStr = malloc (BUFFSZ +2);
    if (toParseStr == NULL) {
        printf ("Could not allocate memory!\n");
        return 1;
    }
    printf ("Enter a string: ");
    if (fgets (toParseStr, BUFFSZ +2, stdin) == NULL) {
        printf ("\nGot end of file!\n");
        return 1;
    }
    printf ("Your string was: %s", toParseStr);
    if (toParseStr[strlen (toParseStr) - 1] != '\n') {
        printf ("\nIn addition, your string was too long!\n");
    }
    free (toParseStr);
    return 0;
}




    
    #define BUFFSZ 1024
    #include <stdlib.h>
    #include <stdio.h>
    #include <string.h>
    
    int main (int argc, char *argv []) {
        char *toParseStr = malloc (BUFFSZ + 2);
        if (!toParseStr) {
            perror ("Could not allocate memory!\n");
            return 1;
        }
        fputs ("Enter a string: ", stdout);
        if (!fgets (toParseStr, BUFFSZ +2, stdin)) {
            perror ("\nGot end of file!\n");
            return 1;
        }
        fputs ("Your string was: ", stdout);
        puts (toParseStr);
        if (!strchr (toParseStr, '\n')) {
            puts ("\nIn addition, your string was too long!");
        }
        free (toParseStr);
        return 0;
}


