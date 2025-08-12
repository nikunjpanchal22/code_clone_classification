int main (void) {
    system ("stty raw");
    unsigned int count = 0;
    for (;;) {
        if (inputExists ()) {
            char input [256] = {0};
            read (0, input, 255);
            count += strlen (input);
            printf ("\rCount is now %d\n", count);
        }
        else if (count > 0) {
            count--;
            printf ("\rDecremented count to %d\n", count);
        }
        puts ("\rWaiting...");
        wait ();
    }
}





#include <stdio.h>
#include <unistd.h>
#include <string.h>
#include <sys/select.h>

int inputExists() {
            fd_set set;
            struct timeval timeout;
            FD_ZERO (&set);
            FD_SET (0, &set);
            timeout.tv_sec = 0;
            timeout.tv_usec = 0;
            return select (1, &set, NULL, NULL, &timeout) > 0;
        }

        void wait() {
            struct timeval timeout;
            timeout.tv_sec = 1;
            timeout.tv_usec = 0;
            select (1, NULL, NULL, NULL, &timeout);
        }

        int main (void) {
            system ("stty raw");
            unsigned int count = 0;
            for (;;) {
                if (inputExists ()) {
                    char input [256] = {0};
                    read (0, input, 255);
                    count += strlen (input);
                    printf ("\rCount is now %d\n", count);
                }
                else if (count > 0) {
                    count--;
                    printf ("\rDecremented count to %d\n", count);
                }
                puts ("\rWaiting...");
                wait ();
            }
}


