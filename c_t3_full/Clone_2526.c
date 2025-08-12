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
    char path_buffer [PATH_MAX];
    char *filepath = realpath (__FILE__, path_buffer);
    if (filepath) 
        printf ("%s\n", filepath);
    else {
        fputs ("Error in realpath operation\n", stderr);
        exit (EXIT_FAILURE);
    }
    return 0;
}


