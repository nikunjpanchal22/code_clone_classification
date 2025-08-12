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


 int main (void) {
    printf ("[dad] pid %d\n", getpid ());
    for (int i = 0; i < 3; i++) {
        fork();
        if (fork () == 0) {
            printf ("[son] pid %d from pid %d\n", getpid (), getppid ());
            _exit (0);
        }
    }
    for (int i = 0; i < 3; i++)
        waitpid(-1,NULL,0);
}


