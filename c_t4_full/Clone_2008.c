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
#include <sys/wait.h>
#include <sys/types.h>
#include <unistd.h>

int main() {
    pid_t pid;
    char * args[] = {"DD", NULL};

    if ((pid = fork()) == -1) {
        printf("Fork failed\n");
        exit(1);
    }
    else if (pid == 0) {
        execv("/some/path/to/DD", args);
        printf("execv failed\n");
        exit(1);
    }
    else {
        int status;
        waitpid(pid, &status, 0);
        printf("Child process terminated\n");
    }
    return 0;
}


