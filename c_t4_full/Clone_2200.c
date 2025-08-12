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






#include <stdlib.h>
#include <string.h>

void read_input() {
    char buff [255] = {0};
    fgets (buff, sizeof (buff), stdin);
    buff[strlen(buff) - 1] = '\0';
    printf ("'%s' was read from stdin.\n", buff);
    }

void handle_select(int retval) {
    if (retval == -1) {
        perror ("select()");
        exit (EXIT_FAILURE);
    } else if (retval) {
        read_input();
    } else {
        printf ("No data within five seconds.\n");
    }
    exit (EXIT_SUCCESS);
    }

int main () {
    fd_set rfds;
    struct timeval tv;
    int retval;

    FD_ZERO (&rfds);
    FD_SET (0, &rfds);

    tv.tv_sec = 5;
    tv.tv_usec = 0;

    retval = select (1, &rfds, NULL, NULL, &tv);
    handle_select(retval);
}


