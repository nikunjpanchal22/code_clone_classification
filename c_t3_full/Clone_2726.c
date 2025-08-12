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
int main(int argc, char *argv[]){
    int n, x, i;
    double d[10];
    char message[2000];

    if(argc < 3 || argc > 12) {
        puts("Incorrect usage");
        return 1;
    }

    n = argc - 2;
    x = atoi(argv[1]);

    for(i=0; i < n; i++)
        d[i] = strtod(argv[i + 2], NULL);

    sprintf(message, "%d", x);

    for(i = 0; i < n; i++)
        sprintf(message + strlen(message), " %.2lf", d[i]);
    
    puts(message);
    return 0;
}


