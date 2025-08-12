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
void sighandler(int sign){}
int main() {
    int input_val;
    struct sigaction sa;
    sa.sa_handler = sighandler;
    sigemptyset(&sa.sa_mask);
    sigaction(SIGALRM, &sa, NULL);
    alarm(5);
    if(scanf("%d", &input_val) == 1) {
        printf("%d\n", input_val);
        alarm(0);
    } else {
        puts("timedout");
    }
    return 0;
}


