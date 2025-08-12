int main (void) {
    printf ("[dad] pid %d\n", getpid ());
    for (int i = 0; i < 3; i++)
        if (fork () == 0) {
            printf ("[son] pid %d from pid %d\n", getpid (), getppid ());
            exit (0);
        }
    for (int i = 0; i < 3; i++)
        wait (NULL);
}





#include <sys/wait.h>
#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>

int main() {
    printf("[dad] pid %d\n", getpid());
    for (int i = 0; i < 3; i++)
        if (fork() == 0) {
            printf("[son] pid %d from pid %d\n", getpid(), getppid());
            _Exit(0);
        }
    while(wait(NULL) > 0);
}


