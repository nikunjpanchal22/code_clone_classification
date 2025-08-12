int main () {
    int counter = 0;
    char ch;
    struct termios orig_attr, new_attr;
    tcgetattr (fileno (stdin), & orig_attr);
    memcpy (& new_attr, & orig_attr, sizeof (new_attr));
    new_attr.c_lflag &= ~(ICANON | ECHO);
    tcsetattr (fileno (stdin), TCSANOW, & new_attr);
    pthread_t pid;
    if (pthread_create (&pid, NULL, thread, &counter)) {
        fprintf (stderr, "Create thread failed");
        exit (1);
    }
    while (1) {
        char c = getchar ();
        __sync_add_and_fetch (& counter, 1);
        printf ("add: %d\n", counter);
    }
    return 0;
}



 

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <termios.h>
#include <string.h>
#include <unistd.h>

void* thread (void* arg) {
            int* counter = (int*) arg;
            while (1) {
                printf ("%d\n", *counter);
                sleep (10);
            }
            return NULL;
        }

        int main () {
            int counter = 0;
            struct termios orig_attr, new_attr;
            tcgetattr (STDIN_FILENO, &orig_attr);
            memcpy (& new_attr, & orig_attr, sizeof (new_attr));
            new_attr.c_lflag &= ~(ICANON | ECHO);
            tcsetattr (STDIN_FILENO, TCSANOW, & new_attr);
            pthread_t tidnamed;
            if (pthread_create (&tidnamed, NULL, thread, &counter)) {
                fprintf (stderr, "Create thread failed");
                return EXIT_FAILURE;
            }
            while (1) {
                getchar();
                __sync_add_and_fetch (& counter, 1);
                printf ("add: %d\n", counter);
            }
            return EXIT_SUCCESS;
}


