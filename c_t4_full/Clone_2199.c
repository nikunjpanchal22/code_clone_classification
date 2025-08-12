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

#define TIMEOUT 5

int main () {
    fd_set set;
    struct timeval timeout;
    int ret;
    char buff [255] = {0};

    FD_ZERO (&set);
    FD_SET (0, &set);
    timeout.tv_sec = TIMEOUT;
    timeout.tv_usec = 0;

    ret = select (1, &set, NULL, NULL, &timeout);
    switch (ret) {
        case -1:
            perror ("select()");
            return EXIT_FAILURE;
        case 0:
            printf ("No data within %d seconds.\n", TIMEOUT);
            break;
        default:
            fgets (buff, sizeof(buff), stdin);
            buff[strlen(buff) - 1] = '\0';
            printf ("'%s' was read from stdin.\n", buff);
            break;
    }

    return EXIT_SUCCESS;
}


