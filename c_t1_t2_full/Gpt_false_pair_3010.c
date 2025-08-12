int main () {
    int x;
    struct sigaction sa;
    sa.sa_handler = handler;
    sigemptyset (& sa.sa_mask);
    sa.sa_flags = 0;
    sigaction (SIGALRM, & sa, NULL);
    alarm (5);
    if (scanf ("%d", &x) == 1) {
        printf ("%d\n", x);
        alarm (0);
    }
    else {
        printf ("timedout\n");
    }
    return 0;
}


int main () {
    int x;
    struct sigaction pa;
    pa.sa_handler = handler;
    sigemptyset (& pa.sa_mask);
    pa.sa_flags = 0;
    sigaction (SIGALRM, & pa, NULL);
    alarm (2);
    if (scanf ("%d", &x) == 1) {
        printf ("%d\n", x);
        alarm (0);
    }
    else {
        printf ("timedout\n");
    }
    return 0;
}
