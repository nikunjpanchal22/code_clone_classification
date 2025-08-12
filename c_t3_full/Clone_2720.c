int main (int argc, char *argv []) {
    char msg [2000];
    int msgl;
    int x, i, n;
    double d [10];
    if (argc > 12 || argc < 3) {
        puts ("Usage: prgname ni nd1 {nd2,nd3 ..., nd10}\n");
        return 1;
    }
    n = argc - 2;
    x = atoi (argv[1]);
    for (i = 0; i < n; i++)
        d[i] = strtod (argv[i + 2], NULL);
    *msg = 0;
    msgl = sprintf (msg, "%d", x);
    for (i = 0; i < n; i++)
        msgl += sprintf (msg +msgl, " %lf", d[i]);
    puts (msg);
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
int main(int argc, char *argv[]) {
    char msg[2000];
    int msgLen;
    int x;
    int i;
    int n;
    double d[10];
    if(argc != 3) {
        fprintf(stderr, "Invalid arguments\n");
        return EXIT_FAILURE;
    }
    n = argc - 2;
    x = atoi(argv[1]);
    for(i = 0; i < n; i++)
        d[i] = strtod(argv[i + 2], NULL);
    msgLen = sprintf(msg, "%d", x);
    for(i = 0; i < n; i++)
        msgLen += sprintf(msg + msgLen, " %lf", d[i]);
    fputs(msg, stdout);
    return EXIT_SUCCESS;
}


