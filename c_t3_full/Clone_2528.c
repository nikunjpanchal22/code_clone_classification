int main (void) {
    char buf [PATH_MAX + 1];
    char *res = realpath ("this_source.c", buf);
    if (res) {
        printf ("This source is at %s.\n", buf);
    }
    else {
        perror ("realpath");
        exit (EXIT_FAILURE);
    }
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <unistd.h>

int main (void) {
    char filepath [PATH_MAX + 1];
    char *result = realpath (__FILE__, filepath);
    if (result) 
        printf ("Current source is located at: %s.\n", filepath);
    else {
        perror ("Error with realpath");
        exit (1);
    }
    return EXIT_SUCCESS;
}


