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



#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

int main() {
    int i;
    printf("[dad] pid %d\n", getpid());
    for (i = 0; i < 3; i++)
        if (!fork()) {
            printf("[son] pid %d from pid %d\n", getpid(), getppid());
            _exit(0);
        }
    while (i-- > 0)
        wait(NULL);
} 


