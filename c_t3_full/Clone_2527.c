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
    char path_buffer [PATH_MAX + 1];
    char *disk_location = realpath ("this_source.c", path_buffer);
    if (disk_location) 
        puts(path_buffer);
    else {
        perror ("realpath error");
        return EXIT_FAILURE;
    }
    return EXIT_SUCCESS;
}


