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





#include <unistd.h>
#include <stdio.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <stdlib.h>

int main(void)
{
    printf("[dad] pid %d\n", getpid());
    for (int i = 0; i < 3; ++i)
        if (!fork()) {
            printf("[son] pid %d from [dad] pid %d\n", getpid(), getppid());
            _exit(EXIT_SUCCESS);
        }
    while(wait(NULL) > 0);
}


