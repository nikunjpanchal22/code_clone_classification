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




pp
#include <signal.h>
#include <unistd.h>
#include <stdio.h>
void signal_handler(sig){}
int main() {
    int in;
    struct sigaction sa;
    sa.sa_handler = signal_handler;
    sigemptyset(&sa.sa_mask);
    sigaction(SIGALRM, &sa, NULL);
    alarm(5);
    if(scanf("%d", &in) == 1) {
        printf("%d\n", in);
        alarm(0);
    } else {
        puts("timedout");
    }
    return 0;
}


