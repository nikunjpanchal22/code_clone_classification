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
#include <sys/wait.h>

int main() {
    printf("[dad] pid %d\n", getpid());

    pid_t pid;
    for (int i = 0; i < 3; i++) {
        pid = fork();
        if (pid == 0) {
            printf("[son] pid %d from pid %d\n", getpid(), getppid());
            exit(0);
        }
    }

    for (int i = 0; i < 3; i++)
        wait(NULL);
}


