int main () {
    char *args [2] = {"DD", NULL};
    int D, waitVal3, waitVal4, rc, waitStatus;
    D = fork ();
    if (D == -1) {
        printf ("fork failed\n");
        exit (1);
    }
    if (D == 0) {
        rc = execv ("/some/path/to/DD", args);
        printf ("execv failed: errno: %d\n", errno);
        exit (1);
    }
    if (D != 0) {
        printf ("\nPid = %d Code AA: created proccess Pid = %d (code DD)\n", getpid (), D);
    }
    waitVal4 = wait (&waitStatus);
    waitVal3 = (waitVal4);
    printf ("WAIT VAL: %d", waitVal3);
    if (waitVal3 == D) {
        printf ("\nPid = %d Code AA: process Pid = %d terminated\n", getpid (), D);
    }
    return 0;
}



 

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main () {
    char *args[] = {"DD", NULL};
    int pid, sts, waitResult, rc;
    pid = fork();
    if(pid == -1) { perror("fork failed"); exit(1); }
    if(pid == 0) {
        rc = execv("/some/path/to/DD", args);
        perror("execv failed"); 
        exit(1);
    }
    else {
        printf("\nPid = %d: created process (Pid = %d)\n", getpid(), pid);
    }
    wait(&sts);
    printf("Finalized Pid %d\n", pid);
    return 0;
}


