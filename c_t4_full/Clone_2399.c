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
#define MAX 2000
#define LIMIT 10
int main(int argc, char* argv[]) {
    char message[MAX];
    double numArray[LIMIT];
    int number, count, index;
    if(argc < 3 || argc > 12) {
        puts("Usage: filename <integer> <decimals>");
        return 1;
    }
    number = atoi(argv[1]);
    count = argc - 2;
    for(index = 0; index < count; index++) {
        numArray[index] = atof(argv[index + 2]);
    }
    sprintf(message, "%d", number);
    for(index = 0; index < count; index++) {
        sprintf(message + strlen(message), " %lf", numArray[index]);
    }
    puts(message);
    return 0;
}


