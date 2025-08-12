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
#define BUFFER 2000
int main(int argc, char *argv[]) {
    char msg[BUFFER];
    double d[10];
    int msgLen, x, i, n;
    if (argc > 12 || argc < 3) {
        puts("Invalid number of arguments");
        exit(EXIT_FAILURE);
    }
    n = argc - 2;
    x = atoi(argv[1]);
    for (i = 0; i < n; i++)
        d[i] = atof(argv[i+2]);
    sprintf(msg, "%d", x);
    for(i = 0; i < n; i++)
        sprintf(msg + strlen(msg)," %lf", d[i]);
    puts(msg);
    return 0;
}


