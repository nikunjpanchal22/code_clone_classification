int main (int argc, char *argv []) {
    fd_set rfds;
    struct timeval tv;
    int retval, len;
    char buff [255] = {0};
    FD_ZERO (& rfds);
    FD_SET (0, & rfds);
    tv.tv_sec = 5;
    tv.tv_usec = 0;
    retval = select (1, &rfds, NULL, NULL, &tv);
    if (retval == -1) {
        perror ("select()");
        exit (EXIT_FAILURE);
    }
    else if (retval) {
        fgets (buff, sizeof (buff), stdin);
        len = strlen (buff) - 1;
        if (buff[len] == '\n')
            buff[len] = '\0';
        printf ("'%s' was read from stdin.\n", buff);
    }
    else
        printf ("No data within five seconds.\n");
    exit (EXIT_SUCCESS);
}






#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/select.h>

#define TIMEOUT_SEC 5
#define TIMEOUT_USEC 0
#define BUFF_SIZE 255

int main () {
    fd_set rfds;
    struct timeval tv;
    int retval;
    char buff [BUFF_SIZE];

    FD_ZERO (&rfds);
    FD_SET (0, &rfds);

    tv.tv_sec = TIMEOUT_SEC;
    tv.tv_usec = TIMEOUT_USEC

    retval = select (1, &rfds, NULL, NULL, &tv);
    if (retval == -1) {
        perror ("select()");
        return EXIT_FAILURE;
    } else if (retval) {
        fgets (buff, sizeof (buff), stdin);
        buff[strlen(buff) - 1] = '\0';
        printf ("'%s' was read from stdin.\n", buff);
    } else {
        printf ("No data within five seconds.\n");
    }
    return EXIT_SUCCESS;
}


