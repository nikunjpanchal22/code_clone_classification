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
#include <stdio.h>
#include <signal.h>
#include <unistd.h>
void handler(int signo) {}
int main() {
    int x;
    struct sigaction sa;
    sa.sa_handler = handler;
    sigemptyset(&sa.sa_mask);
    sigaction(SIGALRM, &sa, NULL);
    alarm(5);
    if (scanf("%d", &x) == 1) {
        printf("%d\n", x);
        alarm(0);
    } else {
        puts("timedout");
    }
    return 0;
}


